package mdn.transformation;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

public class TransformationView extends ViewPart {
	public static final String ID = "mdn.transformation.TransformationView";

	private Text text;

	public TransformationView() {
		super();
	}

	public void setFocus() {
		text.setFocus();
	}

	public void createPartControl(Composite parent) {
		text = new Text(parent, SWT.BORDER | SWT.V_SCROLL);
		// TODO: Generate multiple code with multiple templates
		text.setText("Generated code appears here.");
	}

	public void setInput(String parameter){
		text.setText(parameter);
	}
}