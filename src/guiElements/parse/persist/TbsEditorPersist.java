package guiElements.parse.persist;

import abstractClasses.AbstractEditor;
import constants.TbsConstants;
import controler.TbsEditorPersistListener;
import guiElements.TbsFrame;

public class TbsEditorPersist extends AbstractEditor {
	private static final long serialVersionUID = -5914847088717244068L;
	@SuppressWarnings("unused")
	private TbsFrame frame;
	private TbsEditorPersistBorder border;
	private TbsEditorPersistListener listener;
	
	public TbsEditorPersist(TbsFrame frame) {
		this.frame = frame;
		
		border = new TbsEditorPersistBorder();
		setBorder(border);
		
		setTabSize(TbsConstants.DEFAULT_TAB_SIZE);
		
		listener = new TbsEditorPersistListener();
		addCaretListener(listener);
	}
}
