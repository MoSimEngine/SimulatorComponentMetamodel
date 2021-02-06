package edu.kit.kastel.sdq.scmm.custom.externaljavaactions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import simulatorComponentMetamodel.Simulator;
import simulatorComponentMetamodel.SimulatorComponent;
import simulatorComponentMetamodel.SimulatorComponentMetamodelFactory;
import simulatorComponentMetamodel.SourceFile;
import simulatorComponentMetamodel.SourcePackage;
import simulatorComponentMetamodel.SourceProject;
import spoon.Launcher;
import spoon.SpoonAPI;
import spoon.reflect.CtModel;

public class SCMUtil {

	public static boolean simulatorComponentProjectAlreadyExists(IProject project, Simulator simulator) {
		for(SimulatorComponent simulatorComponent : simulator.getComponents()) {
			if(getSourceProject(project, simulatorComponent) != null) {
				return true;
			}
		}
		return false;
	}

	public static void createSourceProjectInSimulatorComponent(IProject project, SimulatorComponent simulatorComponent) {
		SourceProject sourceProject = SimulatorComponentMetamodelFactory.eINSTANCE.createSourceProject();
		sourceProject.setName(project.getFullPath().toString());
		simulatorComponent.getSourceproject().add(sourceProject);
		SpoonAPI spoonAPI = new Launcher();
		spoonAPI.addInputResource(project.getFullPath().toString());
		spoonAPI.buildModel();
		CtModel ctModel = spoonAPI.getModel();
		System.out.println(ctModel);
		
		addPackagesFromIProjectToSourceProject(project, simulatorComponent);
	}

	public static void reloadSourceProjectsInSimulatorComponents(Simulator simulator) {
		for(SimulatorComponent simulatorComponent : simulator.getComponents()) {
			for(SourceProject sourceProject : simulatorComponent.getSourceproject()) {
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(sourceProject.getName());
				try {
					loadPackagesAndFiles(project, simulatorComponent);
				} catch (CoreException | IOException e) {
					e.printStackTrace();
				}
			}
		}

		for(SimulatorComponent simulatorComponent : simulator.getComponents()) {
			for(SourceProject sourceProject : simulatorComponent.getSourceproject()) {
				IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(sourceProject.getName());
				try {
					loadReferencesBetweenFiles(project, simulatorComponent);
				} catch (CoreException | IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void addPackagesFromIProjectToSourceProject(IProject project, SimulatorComponent simulatorComponent) {
		try {	
			loadPackagesAndFiles(project, simulatorComponent);
			loadReferencesBetweenFiles(project, simulatorComponent);
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void loadPackagesAndFiles(IProject project, SimulatorComponent simulatorComponent) throws CoreException, IOException {

		SourceProject sourceProject = getSourceProject(project, simulatorComponent);
		sourceProject.getSourcepackage().clear();


		List<IFile> files = getSourceFiles(project);
		List<SourcePackage> packages = new ArrayList<SourcePackage>();
		for(IFile file : files) {
			FileContent fileContent = new FileContent(file);
			SourcePackage sourcePackage = getPackage(packages, fileContent.getPackage());
			if(sourcePackage == null) {
				sourcePackage = SimulatorComponentMetamodelFactory.eINSTANCE.createSourcePackage();
				sourcePackage.setName(fileContent.getPackage());
				packages.add(sourcePackage);
			}
			SourceFile sourceFile = SimulatorComponentMetamodelFactory.eINSTANCE.createSourceFile();
			sourceFile.setName(fileContent.getName());
			sourcePackage.getSourcefile().add(sourceFile);
		}
		packages.stream().forEach(x -> sourceProject.getSourcepackage().add(x));
	}

	private static SourceProject getSourceProject(IProject project, SimulatorComponent simulatorComponent) {
		for(SourceProject sourceProject : simulatorComponent.getSourceproject()) {
			if(sourceProject.getName().equals(project.getFullPath().toString())) {
				return sourceProject;
			}
		}
		return null;
	}

	private static void loadReferencesBetweenFiles(IProject project, SimulatorComponent simulatorComponent) throws CoreException, IOException {
		List<IFile> files = getSourceFiles(project);
		SourceProject sourceProject = getSourceProject(project, simulatorComponent);
		List<SourcePackage> packages = sourceProject.getSourcepackage();
		for(IFile file : files) {
			FileContent fileContent = new FileContent(file);
			SourcePackage sourcePackage = getPackage(packages, fileContent.getPackage());
			SourceFile sourceFile = getFile(sourcePackage, fileContent.getName());

			//Clear the file references
			sourceFile.getImports().clear();

			List<String> imports = fileContent.getImports();
			for(String importFileName : imports) {
				SourceFile importSourceFile = getFile((Simulator) simulatorComponent.eContainer(), importFileName);
				if(importSourceFile != null) {
					sourceFile.getImports().add(importSourceFile);
				}
			}
		}
	}

	private static SourceFile getFile(Simulator simulator, String importFileCompleteName) {
		List<SourcePackage> packages = getAllSourcePackages(simulator);
		String importFilePackageName = getPackageName(importFileCompleteName);
		String importFileName = getFileName(importFileCompleteName);
		SourcePackage sourcePackage = getSourcePackage(packages, importFilePackageName);
		SourceFile file = getFile(sourcePackage, importFileName);
		if(file != null) {
			return file;
		}
		return null;
	}
	
	private static String getPackageName(String fileCompleteName) {
		return fileCompleteName.substring(0, fileCompleteName.lastIndexOf("."));
	}
	
	private static String getFileName(String fileCompleteName) {
		return fileCompleteName.substring(fileCompleteName.lastIndexOf(".") + 1, fileCompleteName.length());
	}
	
	private static SourcePackage getSourcePackage(List<SourcePackage> sourcePackages, String sourcePackageName) {
		for(SourcePackage sourcePackage : sourcePackages) {
			if(sourcePackageName.equals(sourcePackage.getName())) {
				return sourcePackage;
			}
		}
		return null;
	}
	
	private static List<SourcePackage> getAllSourcePackages(Simulator simulator){
		List<SourcePackage> packages = new ArrayList<SourcePackage>();
		for(SimulatorComponent simulatorComponent : simulator.getComponents()) {
			for(SourceProject sourceProject : simulatorComponent.getSourceproject()) {
				for(SourcePackage sourcePackage : sourceProject.getSourcepackage()) {
					packages.add(sourcePackage);
				}
			}
		}
		return packages;
	}

	private static SourceFile getFile(SourcePackage sourcePackage, String fileName) {
		if(sourcePackage == null) {
			return null;
		}
		List<SourceFile> list = sourcePackage.getSourcefile();
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(fileName)) {
				return list.get(i);
			}
		}
		return null;
	}

	private static SourcePackage getPackage(List<SourcePackage> list, String packageName) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().equals(packageName)) {
				return list.get(i);
			}
		}
		return null;
	}

	private static List<IFile> getSourceFiles(IContainer container) throws CoreException{
		List<IFile> files = new ArrayList<IFile>();
		for (IResource member : container.members()) {
			if (member instanceof IContainer)
				files.addAll(getSourceFiles((IContainer) member));
			if (member instanceof IFile) {
				if(member.getFileExtension().equals("java")) {
					files.add((IFile) member);
				}
			}
		}
		return files;
	}



	private static class FileContent {

		private String[] fileContent = new String[0];

		private String name;

		private FileContent(IFile file) {
			try {
				BufferedReader br = getBufferedReader(file);
				List<String> fileContentTemp = new ArrayList<String>();
				String line = null;
				while((line = br.readLine()) != null) {
					fileContentTemp.add(line);
				}
				fileContent = fileContentTemp.toArray(fileContent);
				name = file.getName().replace(".java", "");
			} catch (IOException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

		private String getName() {
			return name;
		}

		private String getPackage() throws IOException {
			Optional<String> packageName =  Arrays.stream(fileContent).filter(x -> x.contains("package")).findFirst();
			if(packageName.isPresent()) {
				return removeStrings(packageName.get(), new String[] {"package", ";"});
			} else {
				return null;
			}
		}

		private List<String> getImports() throws IOException {
			List<String> imports = new ArrayList<String>();
			Arrays.stream(fileContent).filter(x -> x.contains("import")).forEach(x -> imports.add(removeStrings(x, new String[] {"import", ";"})));
			return imports;
		}

		private String removeStrings(String string, String[] removals) {
			for(String removal : removals) {
				string = string.replace(removal, "").trim();
			}
			return string;
		}

		private BufferedReader getBufferedReader(IFile file) throws CoreException {
			return new BufferedReader(new InputStreamReader(file.getContents()));
		}

	}
}


