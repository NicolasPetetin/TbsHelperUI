package guiElements.menu;

import javax.swing.JMenu;

import guiElements.TbsFrame;

public class TbsFileMenu extends JMenu {
	private static final long serialVersionUID = 3456224747136733514L;
	private TbsQuitMenuItem quitItem;
	private TbsFrame frame;
	
	public TbsFileMenu(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		setText("Fichier");
		
		this.quitItem = new TbsQuitMenuItem(frame);
		add(quitItem);
	}
}
