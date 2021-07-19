package guiElements.menu;

import javax.swing.JMenu;

public class TbsEditionMenu extends JMenu {
	private static final long serialVersionUID = 7247017533706354105L;
	private TbsCutMenuItem cutItem;
	private TbsCopyMenuItem copyItem;
	private TbsPasteMenuItem pasteItem;
	
	public TbsEditionMenu() {
		this.copyItem = new TbsCopyMenuItem();
		add(copyItem);
		
		this.cutItem = new TbsCutMenuItem();
		add(cutItem);
		
		this.pasteItem = new TbsPasteMenuItem();
		add(pasteItem);

		setText("Edition");
	}
}
