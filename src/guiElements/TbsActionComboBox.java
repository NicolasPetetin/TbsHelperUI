package guiElements;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JComboBox;

import controler.TbsActionComboListener;
import enums.ActionComboItems;

public class TbsActionComboBox extends JComboBox<String> {
	private static final long serialVersionUID = 4467358941646345391L;
	
	public TbsActionComboBox() {
		setPreferredSize(new Dimension(420, 25));
		initValues();
		addActionListener(new TbsActionComboListener());
	}

	private void initValues() {
		List<String> comboValues = ActionComboItems.allTextValues();
		for(String value : comboValues) {
			addItem(value);
		}
	}
}
