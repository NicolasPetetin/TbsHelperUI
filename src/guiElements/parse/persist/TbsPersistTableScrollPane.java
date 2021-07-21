package guiElements.parse.persist;

import java.awt.Color;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class TbsPersistTableScrollPane extends JScrollPane {
	private static final long serialVersionUID = -6237162789903641586L;
	private TbsPersistTable table;
	
	public TbsPersistTableScrollPane() {
		table = new TbsPersistTable();
		getViewport().add(table);
				
		setBackground(Color.WHITE);
		
		setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	}
}
