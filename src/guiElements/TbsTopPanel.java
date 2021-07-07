package guiElements;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TbsTopPanel extends JPanel {
	private static final long serialVersionUID = 8763944186429861974L;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsActionComboBox actionComboBox;
	private TbsPanelSeparator separator;
	private TbsTopPanelBorder border;
	
	public TbsTopPanel(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		border = new TbsTopPanelBorder();
		setBorder(border);
		
		actionComboBox = new TbsActionComboBox(tbsFrame);
		add(actionComboBox, BorderLayout.NORTH);
		
		separator = new TbsPanelSeparator();
		add(separator, BorderLayout.SOUTH);
	}
}
