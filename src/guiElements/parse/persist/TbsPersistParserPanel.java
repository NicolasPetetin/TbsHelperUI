package guiElements.parse.persist;

import java.awt.GridBagConstraints;

import javax.swing.JPanel;

import guiElements.TbsFrame;

public class TbsPersistParserPanel extends JPanel {
	private static final long serialVersionUID = 8005235182189637372L;
	private TbsPersistParserPanelLayout layout;
	private TbsEditorPersist editor;

	public TbsPersistParserPanel(TbsFrame tbsFrame) {
		layout = new TbsPersistParserPanelLayout();
		setLayout(layout);
		
		editor = new TbsEditorPersist();
		GridBagConstraints constrEditor = new GridBagConstraints();
		add(editor, constrEditor);
	}
}
