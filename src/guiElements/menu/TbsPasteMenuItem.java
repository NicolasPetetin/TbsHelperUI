package guiElements.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

public class TbsPasteMenuItem extends JMenuItem{
	private static final long serialVersionUID = 3251218569976132399L;

	public TbsPasteMenuItem() {
		setAction(new DefaultEditorKit.PasteAction());
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_DOWN_MASK));
		setText("Coller");
	}
}
