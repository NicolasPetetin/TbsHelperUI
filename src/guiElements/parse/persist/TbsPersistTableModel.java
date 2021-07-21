package guiElements.parse.persist;

import javax.swing.table.DefaultTableModel;

public class TbsPersistTableModel extends DefaultTableModel {
	private static final long serialVersionUID = -1847811404616242229L;
	
	public void setDefaultTable() {
		String[] columns = {"Pas de persistence à afficher !"};
		setColumnIdentifiers(columns);
		String[][] data = {};
		setDataVector(data, columns);
	}
}
