package guiElements.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

public class TbsCutMenuItem extends JMenuItem{
	private static final long serialVersionUID = 3251218569976132399L;

	public TbsCutMenuItem() {
		setAction(new DefaultEditorKit.CutAction());
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_DOWN_MASK));
		setText("Couper");
	}
}
