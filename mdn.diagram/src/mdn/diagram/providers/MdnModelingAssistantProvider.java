/*
 * 
 */
package mdn.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import mdn.diagram.edit.parts.ActionEditPart;
import mdn.diagram.edit.parts.ConditionEditPart;
import mdn.diagram.edit.parts.ControllerEditPart;
import mdn.diagram.edit.parts.GroupEditPart;
import mdn.diagram.edit.parts.GroupGroupHostsGroupCompartmentEditPart;
import mdn.diagram.edit.parts.Host2EditPart;
import mdn.diagram.edit.parts.HostEditPart;
import mdn.diagram.edit.parts.PacketHeaderEditPart;
import mdn.diagram.edit.parts.RuleEditPart;
import mdn.diagram.edit.parts.SdnEditPart;
import mdn.diagram.edit.parts.SwitchEditPart;
import mdn.diagram.edit.parts.TimeEditPart;
import mdn.diagram.edit.parts.TrafficEditPart;
import mdn.diagram.part.MdnDiagramEditorPlugin;
import mdn.diagram.part.Messages;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class MdnModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SdnEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(10);
			types.add(MdnElementTypes.Controller_2001);
			types.add(MdnElementTypes.Host_2002);
			types.add(MdnElementTypes.Switch_2003);
			types.add(MdnElementTypes.Action_2012);
			types.add(MdnElementTypes.Condition_2013);
			types.add(MdnElementTypes.Traffic_2014);
			types.add(MdnElementTypes.Time_2015);
			types.add(MdnElementTypes.PacketHeader_2016);
			types.add(MdnElementTypes.Rule_2017);
			types.add(MdnElementTypes.Group_2018);
			return types;
		}
		if (editPart instanceof GroupGroupHostsGroupCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(MdnElementTypes.Host_3001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof HostEditPart) {
			return ((HostEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SwitchEditPart) {
			return ((SwitchEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof RuleEditPart) {
			return ((RuleEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Host2EditPart) {
			return ((Host2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof HostEditPart) {
			return ((HostEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SwitchEditPart) {
			return ((SwitchEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TrafficEditPart) {
			return ((TrafficEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TimeEditPart) {
			return ((TimeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PacketHeaderEditPart) {
			return ((PacketHeaderEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof GroupEditPart) {
			return ((GroupEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Host2EditPart) {
			return ((Host2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof HostEditPart) {
			return ((HostEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SwitchEditPart) {
			return ((SwitchEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof RuleEditPart) {
			return ((RuleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Host2EditPart) {
			return ((Host2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ControllerEditPart) {
			return ((ControllerEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof HostEditPart) {
			return ((HostEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SwitchEditPart) {
			return ((SwitchEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TrafficEditPart) {
			return ((TrafficEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TimeEditPart) {
			return ((TimeEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PacketHeaderEditPart) {
			return ((PacketHeaderEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof GroupEditPart) {
			return ((GroupEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Host2EditPart) {
			return ((Host2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof HostEditPart) {
			return ((HostEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SwitchEditPart) {
			return ((SwitchEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActionEditPart) {
			return ((ActionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConditionEditPart) {
			return ((ConditionEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof RuleEditPart) {
			return ((RuleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Host2EditPart) {
			return ((Host2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				MdnDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.MdnModelingAssistantProviderMessage);
		dialog.setTitle(Messages.MdnModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
