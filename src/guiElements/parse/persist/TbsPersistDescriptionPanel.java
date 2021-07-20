package guiElements.parse.persist;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TbsPersistDescriptionPanel extends JPanel {
	private static final long serialVersionUID = -7377445318057354256L;
	private TbsPersistDescriptionLayout layout;
	private TbsPersistValuePanel valuePanel;
	private TbsPersistTablePanel tablePanel;

	public TbsPersistDescriptionPanel() {
		layout = new TbsPersistDescriptionLayout();
		setLayout(layout);
		
		valuePanel = new TbsPersistValuePanel();
		add(valuePanel, BorderLayout.NORTH);
		
		tablePanel = new TbsPersistTablePanel();
		add(tablePanel, BorderLayout.CENTER);
	}
}
