package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class ActionFigure extends ImageFigure {

 public ActionFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/Action.png").createImage(), 0);
 }

}