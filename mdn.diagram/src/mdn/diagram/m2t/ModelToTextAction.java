package mdn.diagram.m2t;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

import mdn.MdnPackage;
import mdn.diagram.part.MdnDiagramEditor;
import mdn.diagram.m2t.TransformationView;


public class ModelToTextAction implements IWorkbenchWindowActionDelegate {

	public ModelToTextAction() {
	}

	public void run(IAction action) {

		// Acessa o editor ativo
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		// Caso seja um diagrama
		if (editor instanceof MdnDiagramEditor) {

			MdnDiagramEditor friendsDiagramEditor = (MdnDiagramEditor) editor;

			// Obtém o modelo EMF do editor
			Resource resource = getFirstSemanticModelResource(friendsDiagramEditor.getEditingDomain().getResourceSet());

			if (resource == null){return;}

			// Envolve o modelo EMF neste InMemoryEmfModel
			InMemoryEmfModel m = new InMemoryEmfModel("M", resource, MdnPackage.eINSTANCE);

			// Constrói o módulo EGL
			EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory());

			Bundle bundle = Platform.getBundle("mdn");
			URL fileURL = bundle.getEntry("m2t/sdn.egl");
			URI uri = null;
			try {
				System.out.println();
				uri = new URI(FileLocator.resolve(fileURL).toString().replace(" ", "%20"));
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				module.parse(uri);
			} catch (Exception e) {
				e.printStackTrace();
			}

			module.getContext().getModelRepository().addModel(m);

			TransformationView view = null;
			try {
				view = (TransformationView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(TransformationView.ID);
			} catch (PartInitException e1) {
				e1.printStackTrace();
			}

			try {
				view.setInput((String) module.execute());
			} catch (EolRuntimeException e) {
				e.printStackTrace();
			}

		}

	}

	public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			return resource;
		}
		return null;
	}

	public void selectionChanged(IAction action, ISelection selection) {}

	public void dispose() {}

	public void init(IWorkbenchWindow window) { }
}