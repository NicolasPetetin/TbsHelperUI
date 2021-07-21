package guiElements.parse.persist;

import javax.swing.JList;

public class TbsPersistList extends JList<String> {
	private static final long serialVersionUID = -3431992362437957421L;
	private TbsPersistListModel model;
	private TbsPersistListBorder border;
	
	public TbsPersistList() {
		model = new TbsPersistListModel();
		super.setModel(model);
		
		border = new TbsPersistListBorder();
		setBorder(border);
	}
	
	public void setDefaultData() {
		model.add("Pas de persistences !");
	}
	
	public TbsPersistListModel getModel() {
		return model;
	}
}
