package guiElements.parse.persist;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class TbsPersistTablePanel extends JPanel{
	private static final long serialVersionUID = -3724351118371921819L;
	private TbsPersistTableScrollPane scrollPane;
	private TbsPersistTableLayout layout;

	public TbsPersistTablePanel() {
		layout = new TbsPersistTableLayout();
		setLayout(layout);
		
		scrollPane = new TbsPersistTableScrollPane();
		add(scrollPane, BorderLayout.CENTER);
	}
}
