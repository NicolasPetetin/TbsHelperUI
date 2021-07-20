package guiElements.parse.persist;

import java.util.ArrayList;

import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class TbsPersistListModel extends ArrayList<String> implements ListModel<String> {	
	private static final long serialVersionUID = 6537053662309069968L;

	public TbsPersistListModel() {
		super();
	}
	
	@Override
	public int getSize() {
		return super.size();
	}

	@Override
	public String getElementAt(int index) {
		return super.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		//Non géré
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// Non géré
	}
}
