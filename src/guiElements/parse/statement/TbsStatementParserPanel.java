package guiElements.parse.statement;

import javax.swing.JPanel;

import guiElements.TbsFrame;

public class TbsStatementParserPanel extends JPanel {
	private static final long serialVersionUID = 1660615527917625521L;
	private TbsStatementParserPanelLayout botLayout;
	private TbsEditorOutput editorOut;
	private TbsEditorInput editorIn;
	@SuppressWarnings("unused")
	private TbsFrame tbsFrame;
	
	public TbsStatementParserPanel(TbsFrame tbsFrame) {
		this.tbsFrame = tbsFrame;
		
		botLayout = new TbsStatementParserPanelLayout();
		setLayout(botLayout);
		
		editorIn = new TbsEditorInput(tbsFrame);
		add(editorIn);
		
		editorOut = new TbsEditorOutput(tbsFrame);
		add(editorOut);
	}
}
