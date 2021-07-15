package guiElements.parse.statement;

import abstractClasses.AbstractEditor;
import controler.TbsEditorMouseListener;
import guiElements.TbsFrame;

public class TbsEditorOutput extends AbstractEditor {
	private static final long serialVersionUID = 7882385475158382092L;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsEditorOutputBorder border;
	private TbsEditorMouseListener mouseListener;
	
	public TbsEditorOutput(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		border = new TbsEditorOutputBorder("Sortie");
		setBorder(border);
		
		mouseListener = new TbsEditorMouseListener(tbsFrame);
		addMouseListener(mouseListener);

		setEditable(false);		
	}
}
