package guiElements.parse.persist;

import javax.swing.JList;

import constants.TbsConstants;

public class TbsPersistList extends JList<String> {
	private static final long serialVersionUID = -3431992362437957421L;
	private TbsPersistListModel model;
	private TbsPersistListBorder border;
	
	public TbsPersistList() {
		model = new TbsPersistListModel();
		super.setModel(model);
		setEnabled(false);
		
		border = new TbsPersistListBorder();
		setBorder(border);
	}
	
	public void setDefaultData() {
		model.add(TbsConstants.NO_PRINTABLE_PERSIST);
	}
	
	public TbsPersistListModel getModel() {
		return model;
	}
}
