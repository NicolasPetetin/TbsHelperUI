package guiElements;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class TbsQuitMenuItem extends JMenuItem{
	private static final long serialVersionUID = -407988331656744958L;

	public TbsQuitMenuItem() {
		setText("Quitter");
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK));
	}
}
