package figures;


import org.eclipse.draw2d.ImageFigure;
import org.eclipse.jface.resource.ImageDescriptor;

import activator.PluginActivator;


public class RelationalOperatorFigure extends ImageFigure {

 public RelationalOperatorFigure() { 
  super(PluginActivator.imageDescriptorFromPlugin(PluginActivator.ID,"images/RelationalOperator.png").createImage(), 0);
 }

}