package guiElements.menu;

import javax.swing.JMenu;

public class TbsFileMenu extends JMenu {
	private static final long serialVersionUID = 3456224747136733514L;
	private TbsQuitMenuItem quitItem;

	public TbsFileMenu() {
		setText("Fichier");
		
		this.quitItem = new TbsQuitMenuItem();
		add(quitItem);
	}
}
