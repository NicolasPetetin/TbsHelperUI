package guiElements;

import javax.swing.JFrame;

public class TbsFrame extends JFrame {
	private static final long serialVersionUID = -7003371634572107802L;

	public TbsFrame() {
		setTitle("TBS UI Helper");
		setSize(1000, 540);
		setResizable(false);
		add(new TbsMainPanel(this));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
