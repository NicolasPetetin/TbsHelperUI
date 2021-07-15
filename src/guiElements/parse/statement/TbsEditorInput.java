package guiElements.parse.statement;

import abstractClasses.AbstractEditor;
import controler.TbsEditorInputListener;
import guiElements.TbsFrame;

public class TbsEditorInput extends AbstractEditor {
	private static final long serialVersionUID = 8124087194160594234L; 
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsEditorInputBorder border;
	private TbsEditorInputListener listener;
	
	public TbsEditorInput(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		border = new TbsEditorInputBorder("Entrée");
		setBorder(border);
		
		listener = new TbsEditorInputListener(tbsFrame);
		addCaretListener(listener);
		
		setTabSize(4);
		requestFocus();
	}
}
