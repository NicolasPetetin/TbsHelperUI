package guiElements.parse.persist;

import javax.swing.table.DefaultTableModel;

import constants.TbsConstants;

public class TbsPersistTableModel extends DefaultTableModel {
	private static final long serialVersionUID = -1847811404616242229L;
	
	public void setDefaultTable() {
		String[] columns = {TbsConstants.NO_PRINTABLE_PERSIST};
		setColumnIdentifiers(columns);
		String[][] data = {};
		setDataVector(data, columns);
	}
}
