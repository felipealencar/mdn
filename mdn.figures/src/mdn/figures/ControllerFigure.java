package mdn.figures;

import org.eclipse.draw2d.ImageFigure;

import mdn.figures.activator.Activator;

public class ControllerFigure extends ImageFigure {

 public ControllerFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Controller.png").createImage(), 0);
 }

}