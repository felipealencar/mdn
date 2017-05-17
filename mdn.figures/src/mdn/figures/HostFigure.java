package mdn.figures;

import org.eclipse.draw2d.ImageFigure;

import mdn.figures.activator.Activator;

public class HostFigure extends ImageFigure {

 public HostFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Host.png").createImage(), 0);
 }

}