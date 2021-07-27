package guiElements.parse.persist;

import abstractClasses.AbstractEditor;
import constants.TbsConstants;
import controler.TbsEditorMouseListener;
import controler.TbsEditorPersistListener;
import guiElements.TbsFrame;

public class TbsEditorPersist extends AbstractEditor {
	private static final long serialVersionUID = -5914847088717244068L;
	private TbsFrame frame;
	private TbsEditorPersistListener listener;
	private TbsEditorMouseListener mouseListener;
	
	public TbsEditorPersist(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		setTabSize(TbsConstants.DEFAULT_TAB_SIZE);
		
		listener = new TbsEditorPersistListener(frame);
		addCaretListener(listener);
		
		mouseListener = new TbsEditorMouseListener(tbsFrame);
		addMouseListener(mouseListener);
	}
}
