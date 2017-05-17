package mdn.figures;

import org.eclipse.draw2d.ImageFigure;

import mdn.figures.activator.Activator;

public class TimeFigure extends ImageFigure {

 public TimeFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Time.png").createImage(), 0);
 }

}