package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class PolicyFigure extends ImageFigure {

 public PolicyFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/Policy.png").createImage(), 0);
 }

}