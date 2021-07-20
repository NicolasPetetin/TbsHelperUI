package guiElements.popupmenu;

import javax.swing.JPopupMenu;

import guiElements.menu.TbsCopyMenuItem;
import guiElements.menu.TbsCutMenuItem;
import guiElements.menu.TbsPasteMenuItem;

public class TbsPopupMenu extends JPopupMenu {
	private static final long serialVersionUID = -4225453306213157590L;
	private TbsCopyMenuItem copyItem;
	private TbsCutMenuItem cutItem;
	private TbsPasteMenuItem pasteItem;
	
	public TbsPopupMenu() {
		copyItem = new TbsCopyMenuItem();
		add(copyItem);
		
		cutItem = new TbsCutMenuItem();
		add(cutItem);
		
		pasteItem = new TbsPasteMenuItem();
		add(pasteItem);
	}
}
