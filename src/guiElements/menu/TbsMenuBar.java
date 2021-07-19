package guiElements.menu;

import javax.swing.JMenuBar;

import guiElements.TbsFrame;

public class TbsMenuBar extends JMenuBar{
	private static final long serialVersionUID = 4662319198646002468L;
	private TbsFileMenu fileMenu;
	private TbsEditionMenu editionMenu;
	private TbsFrame frame;
	
	public TbsMenuBar(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		this.fileMenu = new TbsFileMenu(frame);
		add(fileMenu);
		
		this.editionMenu = new TbsEditionMenu();
		add(editionMenu);
	}
}
