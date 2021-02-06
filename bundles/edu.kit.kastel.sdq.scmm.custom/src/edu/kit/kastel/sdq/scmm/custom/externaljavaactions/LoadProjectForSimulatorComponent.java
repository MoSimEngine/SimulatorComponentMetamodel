package edu.kit.kastel.sdq.scmm.custom.externaljavaactions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import simulatorComponentMetamodel.Simulator;
import simulatorComponentMetamodel.SimulatorComponent;

public class LoadProjectForSimulatorComponent implements IExternalJavaAction {

	public static final Shell SHELL = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		SimulatorComponent simulatorComponent = (SimulatorComponent) selections.iterator().next();
		
		Simulator simulator = (Simulator) simulatorComponent.eContainer();
		
    	LoadResourceFromWorkspaceDialog dialog = new LoadResourceFromWorkspaceDialog(SHELL, new RemainingProjectProvider(simulator));
		dialog.setBlockOnOpen(true);
		dialog.open();
		
		IStructuredSelection projects = dialog.getSelection();
		if (projects == null || projects.isEmpty()) //e.g. on cancel
			return;
		
		for(Object project : projects) {
			SCMUtil.createSourceProjectInSimulatorComponent((IProject) project, simulatorComponent);
			break;
		}
		
	}
	
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}
}
