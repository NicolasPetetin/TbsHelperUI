package guiElements;

import javax.swing.JPanel;

public class TbsBottomPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	private TbsBottomPanelLayout botLayout;
	private TbsEditorOutput editorOut;
	private TbsEditorInput editorIn;

	public TbsBottomPanel(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame; 
		
		botLayout = new TbsBottomPanelLayout();
		setLayout(botLayout);
		
		editorIn = new TbsEditorInput(tbsFrame);
		add(editorIn);
		
		editorOut = new TbsEditorOutput(tbsFrame);
		add(editorOut);
	}
}
