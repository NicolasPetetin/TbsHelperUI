package guiElements;

import javax.swing.JPanel;

public class TbsTopPanel extends JPanel {
	private static final long serialVersionUID = 8763944186429861974L;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsActionComboBox actionComboBox;
	
	public TbsTopPanel(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
				
		actionComboBox = new TbsActionComboBox();
		add(actionComboBox);
	}
}
