package guiElements.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class TbsPasteMenuItem extends JMenuItem{
	private static final long serialVersionUID = 3251218569976132399L;

	public TbsPasteMenuItem() {
		setText("Copier");
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
	}
}
