package guiElements.parse.persist;

import java.awt.GridBagConstraints;

import javax.swing.JPanel;

import guiElements.TbsFrame;

public class TbsPersistViewerPanel extends JPanel {
	private static final long serialVersionUID = 4914977858944634356L;
	@SuppressWarnings("unused")
	private TbsFrame frame;
	private TbsPersistViewerLayout layout;
	private TbsPersistListPane listPane;
	private TbsPersistDescriptionPanel panel;
	
	public TbsPersistViewerPanel(TbsFrame frame) {
		this.frame = frame;
		
		layout = new TbsPersistViewerLayout();
		setLayout(layout);
		
		GridBagConstraints constr = new GridBagConstraints();
		constr.fill = GridBagConstraints.BOTH;
		constr.gridx = 0;
		constr.gridy = 0;
		constr.weightx = 1.0D;
		constr.weighty = 1.0D;
		listPane = new TbsPersistListPane(frame);
		add(listPane, constr);
		
		constr = new GridBagConstraints();
		constr.fill = GridBagConstraints.BOTH;
		constr.gridx = 1;
		constr.gridy = 0;
		constr.weightx = 7.0D;
		constr.weighty = 1.0D;
		panel = new TbsPersistDescriptionPanel();
		add(panel, constr);
	}
}
