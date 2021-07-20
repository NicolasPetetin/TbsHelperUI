package guiElements.parse.persist;

import javax.swing.JPanel;

import guiElements.TbsFrame;

public class TbsEditorPersistPanel extends JPanel{
	private static final long serialVersionUID = 2512516054460586732L;
	@SuppressWarnings("unused")
	private TbsFrame frame;
	private TbsEditorPersist editor;
	private TbsEditorPersistLayout layout;
	
	public TbsEditorPersistPanel(TbsFrame frame) {
		this.frame = frame;
		
		layout = new TbsEditorPersistLayout();
		setLayout(layout);
		
		editor = new TbsEditorPersist(frame);
		add(editor);
	}
}
