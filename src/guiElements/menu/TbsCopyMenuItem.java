package guiElements.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class TbsCopyMenuItem extends JMenuItem{
	private static final long serialVersionUID = 3251218569976132399L;

	public TbsCopyMenuItem() {
		setText("Coller");
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
	}
}
