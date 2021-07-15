package guiElements;

import javax.swing.JFrame;

import guiElements.menu.TbsMenuBar;
import guiElements.popupmenu.TbsPopupMenu;

public class TbsFrame extends JFrame {
	private static final long serialVersionUID = -7003371634572107802L;
	private TbsMainPanel mainPanel;
	private TbsMenuBar menuBar;
	private TbsPopupMenu popupMenu;
	
	public TbsFrame() {
		super();
		
		this.popupMenu = new TbsPopupMenu();
		
		this.menuBar = new TbsMenuBar();
		setJMenuBar(menuBar);

		this.mainPanel = new TbsMainPanel(this);
		add(mainPanel);

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

	public TbsPopupMenu getPopupMenu() {
		return popupMenu;
	}
}
