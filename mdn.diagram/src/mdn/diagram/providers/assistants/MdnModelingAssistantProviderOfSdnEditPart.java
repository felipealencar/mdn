/*
 * 
 */
package mdn.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import mdn.diagram.providers.MdnElementTypes;
import mdn.diagram.providers.MdnModelingAssistantProvider;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MdnModelingAssistantProviderOfSdnEditPart extends
		MdnModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(11);
		types.add(MdnElementTypes.Controller_2001);
		types.add(MdnElementTypes.Host_2002);
		types.add(MdnElementTypes.Switch_2003);
		types.add(MdnElementTypes.AppMonitor_2019);
		types.add(MdnElementTypes.Rule_2021);
		types.add(MdnElementTypes.Condition_2013);
		types.add(MdnElementTypes.Traffic_2014);
		types.add(MdnElementTypes.Time_2015);
		types.add(MdnElementTypes.PacketHeader_2016);
		types.add(MdnElementTypes.App_2020);
		types.add(MdnElementTypes.Group_2018);
		return types;
	}

}
