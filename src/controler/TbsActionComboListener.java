package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import enums.ActionComboItems;
import guiElements.TbsActionComboBox;

public class TbsActionComboListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if("comboBoxChanged".equals(actionCommand)) {
			TbsActionComboBox comboBox = (TbsActionComboBox) e.getSource();
			String libItem = (String) comboBox.getSelectedItem();
			ActionComboItems item = ActionComboItems.fromString(libItem);
			doAction(item);
		}
	}

	private void doAction(ActionComboItems item) {
		switch (item) {
		case PARSE_PERSIST:
			//TODO
			break;
		case PARSE_STATEMENT:
			//TODO
			break;
		}
	}
}
