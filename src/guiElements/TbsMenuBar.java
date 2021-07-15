package guiElements;

import javax.swing.JMenuBar;

public class TbsMenuBar extends JMenuBar{
	private static final long serialVersionUID = 4662319198646002468L;
	private TbsFileMenu fileMenu;
	private TbsEditionMenu editionMenu;
	
	public TbsMenuBar() {
		this.fileMenu = new TbsFileMenu();
		add(fileMenu);
		
		this.editionMenu = new TbsEditionMenu();
		add(editionMenu);
	}
}
