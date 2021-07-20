package guiElements.parse.persist;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TbsPersistTablePanel extends JScrollPane {
	private static final long serialVersionUID = -3724351118371921819L;
	private TbsPersistTable table;

	public TbsPersistTablePanel() {
		table = new TbsPersistTable();
		add(table);
		
		setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
}
