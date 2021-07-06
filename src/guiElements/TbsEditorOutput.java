package guiElements;

import abstractClasses.AbstractEditor;

public class TbsEditorOutput extends AbstractEditor {
	private static final long serialVersionUID = 7882385475158382092L;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsEditorOutputBorder border;
	
	public TbsEditorOutput(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		border = new TbsEditorOutputBorder("Sortie");
		setBorder(border);
		
		setEditable(false);
	}
}
