package mdn.figures;

import org.eclipse.draw2d.ImageFigure;

import mdn.figures.activator.Activator;

public class PacketHeaderFigure extends ImageFigure {

 public PacketHeaderFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/PacketHeader.png").createImage(), 0);
 }

}