package guiElements.parse.persist;

import javax.swing.JTable;

public class TbsPersistTable extends JTable {
	private static final long serialVersionUID = -2215172603976972591L;
	private TbsPersistTableModel model;
	
	public TbsPersistTable() {
		model = new TbsPersistTableModel();
		setModel(model);
	}
}
