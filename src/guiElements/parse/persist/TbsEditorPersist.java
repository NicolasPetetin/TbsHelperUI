package guiElements.parse.persist;

import abstractClasses.AbstractEditor;
import constants.TbsConstants;
import controler.TbsEditorPersistListener;
import guiElements.TbsFrame;

public class TbsEditorPersist extends AbstractEditor {
	private static final long serialVersionUID = -5914847088717244068L;
	private TbsFrame frame;
	private TbsEditorPersistBorder border;
	private TbsEditorPersistListener listener;
	
	public TbsEditorPersist(TbsFrame tbsFrame) {
		this.frame = tbsFrame;
		
		border = new TbsEditorPersistBorder();
		setBorder(border);
		
		setTabSize(TbsConstants.DEFAULT_TAB_SIZE);
		
		listener = new TbsEditorPersistListener(frame);
		addCaretListener(listener);
	}
}
