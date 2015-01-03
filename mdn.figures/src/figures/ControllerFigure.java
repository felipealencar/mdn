package figures;


import org.eclipse.draw2d.*;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class ControllerFigure extends ImageFigure {

 public ControllerFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/Controller.png").createImage(), 0);
 }

}