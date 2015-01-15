package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class PacketHeaderFigure extends ImageFigure {

 public PacketHeaderFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/PacketHeader.png").createImage(), 0);
 }

}