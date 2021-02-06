package edu.kit.kastel.sdq.scmm.custom.externaljavaactions;

import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.jface.viewers.IStructuredContentProvider;

import simulatorComponentMetamodel.Simulator;

public class RemainingProjectProvider implements IStructuredContentProvider {
	
	Simulator simulator = null;

	public RemainingProjectProvider(Simulator simulator) {
		this.simulator = simulator;
	}
	
	@Override
	public Object[] getElements(Object inputElement) {
		IProject[] allProjects = ((IWorkspace) inputElement).getRoot().getProjects();

		ArrayList<IProject> remainingProjects = new ArrayList<IProject>();
		
		for(IProject project : allProjects) {
			if(!SCMUtil.simulatorComponentProjectAlreadyExists(project, simulator)) {
				remainingProjects.add(project);
			}
		}

		return remainingProjects.toArray();

	}
}