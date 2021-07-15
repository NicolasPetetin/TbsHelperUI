package guiElements.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.text.DefaultEditorKit;

public class TbsCopyMenuItem extends JMenuItem{
	private static final long serialVersionUID = 3251218569976132399L;

	public TbsCopyMenuItem() {
		setAction(new DefaultEditorKit.CopyAction());
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		setText("Copier");
	}
}
