/*
 * 
 */
package mdn.diagram.edit.policies;

import java.util.Iterator;

import mdn.App;
import mdn.Condition;
import mdn.Controller;
import mdn.Group;
import mdn.Host;
import mdn.NetworkNode;
import mdn.PacketHeader;
import mdn.Rule;
import mdn.Switch;
import mdn.Time;
import mdn.Traffic;
import mdn.diagram.part.MdnDiagramEditorPlugin;
import mdn.diagram.part.MdnVisualIDRegistry;
import mdn.diagram.providers.MdnElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

/**
 * @generated
 */
public class MdnBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected MdnBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						MdnVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = MdnElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = MdnDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			MdnDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateHostHostSwitch_4004(Host source, Switch target) {
			if (source != null) {
				if (source.getHostSwitch() != null) {
					return false;
				}
			}

			return canExistHostHostSwitch_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSwitchSwitchController_4006(Switch source,
				Controller target) {
			if (source != null) {
				if (source.getSwitchController().contains(target)) {
					return false;
				}
			}

			return canExistSwitchSwitchController_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSwitchSwitches_4022(Switch source, Switch target) {
			if (source != null) {
				if (source.getSwitches().contains(target)) {
					return false;
				}
			}

			return canExistSwitchSwitches_4022(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRuleSourceHostRule_4024(Rule source, Host target) {
			if (source != null) {
				if (source.getSourceHostRule().contains(target)) {
					return false;
				}
			}

			return canExistRuleSourceHostRule_4024(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRuleTargetHostRule_4025(Rule source, Host target) {
			if (source != null) {
				if (source.getTargetHostRule().contains(target)) {
					return false;
				}
			}

			return canExistRuleTargetHostRule_4025(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRuleRuleCondition_4026(Rule source,
				Condition target) {
			if (source != null) {
				if (source.getRuleCondition().contains(target)) {
					return false;
				}
			}

			return canExistRuleRuleCondition_4026(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateRuleTargetGroupRule_4028(Rule source,
				Group target) {
			if (source != null) {
				if (source.getTargetGroupRule().contains(target)) {
					return false;
				}
			}

			return canExistRuleTargetGroupRule_4028(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAppActionPacketHeader_4029(App source,
				PacketHeader target) {
			if (source != null) {
				if (source.getActionPacketHeader().contains(target)) {
					return false;
				}
			}

			return canExistAppActionPacketHeader_4029(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAppAppToNetworkNode_4030(App source,
				NetworkNode target) {
			if (source != null) {
				if (source.getAppToNetworkNode() != null) {
					return false;
				}
			}

			return canExistAppAppToNetworkNode_4030(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAppControllerApp_4031(App source,
				Controller target) {
			if (source != null) {
				if (source.getControllerApp().contains(target)) {
					return false;
				}
			}

			return canExistAppControllerApp_4031(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAppAppRule_4032(App source, Rule target) {
			if (source != null) {
				if (source.getAppRule().contains(target)) {
					return false;
				}
			}

			return canExistAppAppRule_4032(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateAppTargetSwitch_4033(App source, Switch target) {
			if (source != null) {
				if (source.getTargetSwitch().contains(target)) {
					return false;
				}
			}

			return canExistAppTargetSwitch_4033(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConditionConditionTime_4017(Condition source,
				Time target) {
			if (source != null) {
				if (source.getConditionTime() != null) {
					return false;
				}
			}

			return canExistConditionConditionTime_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConditionConditionTraffic_4018(
				Condition source, Traffic target) {
			if (source != null) {
				if (source.getConditionTraffic() != null) {
					return false;
				}
			}

			return canExistConditionConditionTraffic_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConditionConditionPacket_4019(Condition source,
				PacketHeader target) {
			if (source != null) {
				if (source.getConditionPacket() != null) {
					return false;
				}
			}

			return canExistConditionConditionPacket_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistHostHostSwitch_4004(Host source, Switch target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSwitchSwitchController_4006(Switch source,
				Controller target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSwitchSwitches_4022(Switch source, Switch target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRuleSourceHostRule_4024(Rule source, Host target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRuleTargetHostRule_4025(Rule source, Host target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRuleRuleCondition_4026(Rule source,
				Condition target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistRuleTargetGroupRule_4028(Rule source,
				Group target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAppActionPacketHeader_4029(App source,
				PacketHeader target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAppAppToNetworkNode_4030(App source,
				NetworkNode target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAppControllerApp_4031(App source,
				Controller target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAppAppRule_4032(App source, Rule target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistAppTargetSwitch_4033(App source, Switch target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConditionConditionTime_4017(Condition source,
				Time target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConditionConditionTraffic_4018(Condition source,
				Traffic target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConditionConditionPacket_4019(Condition source,
				PacketHeader target) {
			return true;
		}
	}

}
