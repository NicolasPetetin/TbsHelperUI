package guiElements.parse.persist;

import java.awt.GridBagConstraints;

import javax.swing.JPanel;

import guiElements.TbsFrame;

public class TbsPersistParserPanel extends JPanel {
	private static final long serialVersionUID = 8005235182189637372L;
	private TbsFrame frame;
	private TbsPersistParserPanelLayout layout;
	private TbsEditorPersistPanel topPanel;
	private TbsPersistViewerPanel bottomPanel;

	public TbsPersistParserPanel(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		layout = new TbsPersistParserPanelLayout();
		setLayout(layout);
		
		GridBagConstraints constr = new GridBagConstraints();
		constr.fill = GridBagConstraints.BOTH;
		constr.gridy = 0;
		constr.weightx = 1.0D;
		constr.weighty = 1.0D;
		topPanel = new TbsEditorPersistPanel(frame);
		add(topPanel, constr);
		
		constr = new GridBagConstraints();
		constr.fill = GridBagConstraints.BOTH;
		constr.gridy = 1;
		constr.gridheight = 2;
		constr.weightx = 1.0D;
		constr.weighty = 4.0D;
		bottomPanel = new TbsPersistViewerPanel(frame);
		add(bottomPanel, constr);
	}
}
