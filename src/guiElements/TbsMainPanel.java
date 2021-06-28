package guiElements;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TbsMainPanel extends JPanel {
	private static final long serialVersionUID = 7275433749447673564L;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsTopPanel topPanel;
	private TbsBottomPanel bottomPanel;
	private TbsMainLayout tbsMainLayout;
	
	public TbsMainPanel(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		this.tbsMainLayout = new TbsMainLayout();
		setLayout(tbsMainLayout);
				
		topPanel = new TbsTopPanel(tbsFrame);
		add(topPanel, BorderLayout.NORTH);
		
		bottomPanel = new TbsBottomPanel(tbsFrame);
		add(bottomPanel, BorderLayout.CENTER);
		
		
	}
}
