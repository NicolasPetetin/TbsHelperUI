package guiElements.parse.persist;

import javax.swing.JPanel;

public class TbsPersistValuePanel extends JPanel {
	private static final long serialVersionUID = 9208297879702415463L;
	private TbsPersistValueLabel label;
	private TbsPersistValueInput input;

	public TbsPersistValuePanel() {
		label = new TbsPersistValueLabel();
		add(label);
		
		input = new TbsPersistValueInput();
		add(input);
	}
}
