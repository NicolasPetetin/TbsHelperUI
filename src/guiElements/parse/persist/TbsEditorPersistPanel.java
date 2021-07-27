package guiElements.parse.persist;

import java.awt.Color;

import javax.swing.JScrollPane;

import guiElements.TbsFrame;

public class TbsEditorPersistPanel extends JScrollPane{
	private static final long serialVersionUID = 2512516054460586732L;
	@SuppressWarnings("unused")
	private TbsFrame frame;
	private TbsEditorPersistBorder border;
	private TbsEditorPersist editor;
	
	public TbsEditorPersistPanel(TbsFrame frame) {
		this.frame = frame;
		
		border = new TbsEditorPersistBorder();
		setBorder(border);
		
		setBackground(Color.WHITE);
		
		editor = new TbsEditorPersist(frame);
		getViewport().add(editor);
	}
}
