package guiElements.parse.statement;

import abstractClasses.AbstractEditor;
import constants.TbsConstants;
import controler.TbsEditorInputListener;
import controler.TbsEditorMouseListener;
import guiElements.TbsFrame;

public class TbsEditorInput extends AbstractEditor {
	private static final long serialVersionUID = 8124087194160594234L; 
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsEditorInputBorder border;
	private TbsEditorInputListener listener;
	private TbsEditorMouseListener mouseListener;
	
	public TbsEditorInput(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		border = new TbsEditorInputBorder("Entrée");
		setBorder(border);
		
		listener = new TbsEditorInputListener(tbsFrame);
		addCaretListener(listener);
		
		mouseListener = new TbsEditorMouseListener(tbsFrame);
		addMouseListener(mouseListener);
		
		setTabSize(TbsConstants.DEFAULT_TAB_SIZE);
		requestFocus();
	}
}
