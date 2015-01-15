package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class TrafficFigure extends ImageFigure {

 public TrafficFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/Traffic.png").createImage(), 0);
 }

}