package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import guiElements.TbsFrame;

public class TbsQuitListener implements ActionListener {
	private TbsFrame frame;
	
	public TbsQuitListener(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.dispose();
	}
}
