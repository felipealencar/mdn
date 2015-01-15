package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class TimeFigure extends ImageFigure {

 public TimeFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/Time.png").createImage(), 0);
 }

}