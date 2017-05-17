package mdn.figures;

import org.eclipse.draw2d.ImageFigure;

import mdn.figures.activator.Activator;

public class TrafficFigure extends ImageFigure {

 public TrafficFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Traffic.png").createImage(), 0);
 }

}