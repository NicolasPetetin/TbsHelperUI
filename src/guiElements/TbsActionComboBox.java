package guiElements;

import javax.swing.JComboBox;

public class TbsActionComboBox extends JComboBox<String> {
	private static final long serialVersionUID = 4467358941646345391L;
	
	public TbsActionComboBox() {
		initValues();
	}

	private void initValues() {
		addItem("Parser une requête");
		addItem("Option 2...");
		addItem("Option 3...");
	}
}
