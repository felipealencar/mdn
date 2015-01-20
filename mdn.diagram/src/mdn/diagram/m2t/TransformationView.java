package mdn.diagram.m2t;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class TransformationView extends ViewPart {
 public static final String ID = "mdn.diagram.m2t.TransformationView";

 private Text text;
 
 public TransformationView() {
  super();
 }

 public void setFocus() {
  text.setFocus();
 }

 public void createPartControl(Composite parent) {
  text = new Text(parent, SWT.BORDER | SWT.V_SCROLL);
  text.setText("código gerado aqui");
 }

 public void setInput(String parameter){
  text.setText(parameter);
 }
}