package guiElements;

import javax.swing.JEditorPane;

import controler.TbsEditorInputListener;

public class TbsEditorInput extends JEditorPane {
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
	}
}
