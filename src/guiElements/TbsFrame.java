package guiElements;

import javax.swing.JFrame;

public class TbsFrame extends JFrame {
	private static final long serialVersionUID = -7003371634572107802L;
	private TbsMainPanel mainPanel;
	private TbsMenuBar menuBar;
	
	public TbsFrame() {
		super();
		
		this.mainPanel = new TbsMainPanel(this);
		add(mainPanel);
		
		this.menuBar = new TbsMenuBar();
		setJMenuBar(menuBar);

		setTitle("TBS UI Helper");
		setSize(1000, 540);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public TbsMainPanel getMainPanel() {
		return mainPanel;
	}

	public void afterInit() {
		getMainPanel().getBottomPanel().setDefaultBottomPanel();
	}
}
