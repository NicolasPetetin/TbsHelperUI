package controler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import guiElements.TbsFrame;

public class TbsEditorMouseListener extends MouseAdapter{
	private TbsFrame frame;
	
	public TbsEditorMouseListener(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		//BUTTON3 = Right-click
		if(MouseEvent.BUTTON3 == e.getButton()) {
			frame.getPopupMenu().show(e.getComponent(), e.getX(), e.getY());
		}
	}
}
