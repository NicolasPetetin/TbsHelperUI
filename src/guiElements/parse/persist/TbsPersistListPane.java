package guiElements.parse.persist;

import java.awt.Color;

import javax.swing.JScrollPane;

import guiElements.TbsFrame;

public class TbsPersistListPane extends JScrollPane {
	private static final long serialVersionUID = -5353586762104035356L;
	private TbsFrame frame;
	private TbsPersistList list;
	private TbsPersistListBorder border;
	
	public TbsPersistListPane(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		border = new TbsPersistListBorder();
		setBorder(border);
		
		setBackground(Color.WHITE);
		
		list = new TbsPersistList(frame);
		list.setDefaultData();
		getViewport().add(list);
	}
}
