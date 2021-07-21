package guiElements.parse.persist;

import javax.swing.table.DefaultTableModel;

public class TbsPersistTableModel extends DefaultTableModel {
	private static final long serialVersionUID = -1847811404616242229L;
	
	public void setDefaultTable() {
		String[] columns = {"Test NPN"};
		setColumnIdentifiers(columns);
		
		String[][] data = {
				{"Test 1"},
				{"Test 2"},
				{"Test 3"}
		};
		setDataVector(data, columns);
	}
}
