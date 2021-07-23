package guiElements.parse.persist;

import javax.swing.JList;

import constants.TbsConstants;
import controler.TbsPersistListListener;
import guiElements.TbsFrame;

public class TbsPersistList extends JList<String> {
	private static final long serialVersionUID = -3431992362437957421L;
	@SuppressWarnings("unused")
	private TbsFrame frame;
	private TbsPersistListModel model;
	private TbsPersistListBorder border;
	private TbsPersistListListener listener;
	
	public TbsPersistList(TbsFrame frame) {
		this.frame = frame;
		
		model = new TbsPersistListModel();
		super.setModel(model);
		setEnabled(false);
		
		border = new TbsPersistListBorder();
		setBorder(border);
		
		listener = new TbsPersistListListener(frame);
		addListSelectionListener(listener);
	}
	
	public void setDefaultData() {
		model.clear();
		model.addElement(TbsConstants.NO_PRINTABLE_PERSIST);
	}
	
	public TbsPersistListModel getModel() {
		return model;
	}
}
