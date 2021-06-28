package guiElements;

import javax.swing.JEditorPane;

public class TbsEditorOutput extends JEditorPane {
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
