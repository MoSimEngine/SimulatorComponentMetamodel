package edu.kit.kastel.sdq.scmm.custom.externaljavaactions;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import simulatorComponentMetamodel.Simulator;

public class SyncProjectsForSimulator implements IExternalJavaAction {

	public static final Shell SHELL = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	
	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		Simulator simulator = (Simulator) selections.iterator().next();
		
		SCMUtil.reloadSourceProjectsInSimulatorComponents(simulator);
	}
	
	
	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
