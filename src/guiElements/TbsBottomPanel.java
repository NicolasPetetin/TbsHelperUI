package guiElements;

import javax.swing.JPanel;

import enums.ActionComboItems;
import helpers.TbsActionHandler;

public class TbsBottomPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private TbsFrame frame;
	private TbsBottomPanelLayout bottomLayout;

	public TbsBottomPanel(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		bottomLayout = new TbsBottomPanelLayout();
		setLayout(bottomLayout);
	}
	
	public void setDefaultBottomPanel() {
		ActionComboItems defaultItem = ActionComboItems.getDefaultValue();
		TbsActionHandler.doAction(defaultItem, frame);
	}
}
