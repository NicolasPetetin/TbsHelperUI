package guiElements.parse.persist;

import javax.swing.JList;

public class TbsPersistList extends JList<String> {
	private static final long serialVersionUID = -3431992362437957421L;
	private TbsPersistListModel model;
	
	public TbsPersistList() {
		model = new TbsPersistListModel();
		super.setModel(model);
	}
}
