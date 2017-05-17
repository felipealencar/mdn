package mdn.figures;

import org.eclipse.draw2d.ImageFigure;

import mdn.figures.activator.Activator;

public class ConditionFigure extends ImageFigure {

 public ConditionFigure() { 
  super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,"images/Condition.png").createImage(), 0);
 }

}