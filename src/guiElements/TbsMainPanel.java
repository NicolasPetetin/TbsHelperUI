package guiElements;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TbsMainPanel extends JPanel {
	private static final long serialVersionUID = 7275433749447673564L;
	private TbsFrame frame;
	private TbsTopPanel topPanel;
	private TbsBottomPanel bottomPanel;
	private TbsMainLayout tbsMainLayout;
	
	public TbsMainPanel(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		this.tbsMainLayout = new TbsMainLayout();
		setLayout(tbsMainLayout);
				
		topPanel = new TbsTopPanel(frame);
		add(topPanel, BorderLayout.NORTH);
		
		bottomPanel = new TbsBottomPanel(frame);
		add(bottomPanel, BorderLayout.CENTER);	
	}
	
	public TbsBottomPanel getBottomPanel() {
		return bottomPanel;
	}
}
