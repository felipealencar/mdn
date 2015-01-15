package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class ConditionFigure extends ImageFigure {

 public ConditionFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/Condition.png").createImage(), 0);
 }

}