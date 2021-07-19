package guiElements.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import controler.TbsQuitListener;
import guiElements.TbsFrame;

public class TbsQuitMenuItem extends JMenuItem{
	private static final long serialVersionUID = -407988331656744958L;
	private TbsFrame frame;
	private TbsQuitListener quitListener;

	public TbsQuitMenuItem(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, KeyEvent.ALT_DOWN_MASK));
		setText("Quitter");
		
		quitListener = new TbsQuitListener(tbsFrame);
		addActionListener(quitListener);
	}
	
	public TbsFrame getFrame() {
		return frame;
	}
}
