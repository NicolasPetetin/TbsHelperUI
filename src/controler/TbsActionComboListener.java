package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import enums.ActionComboItems;
import guiElements.TbsActionComboBox;
import guiElements.TbsFrame;
import helpers.TbsActionHandler;

public class TbsActionComboListener implements ActionListener {
	private TbsFrame tbsFrame;

	public TbsActionComboListener(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if("comboBoxChanged".equals(actionCommand)) {
			TbsActionComboBox comboBox = (TbsActionComboBox) e.getSource();
			String libItem = (String) comboBox.getSelectedItem();
			ActionComboItems item = ActionComboItems.fromString(libItem);
			TbsActionHandler.doAction(item, tbsFrame);
		}
	}
}
