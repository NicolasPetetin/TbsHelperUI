package guiElements.parse.persist;

import java.awt.Dimension;

import javax.swing.JTextField;

public class TbsPersistValueInput extends JTextField {
	private static final long serialVersionUID = -8020988348133560742L;
	
	public TbsPersistValueInput() {
		setPreferredSize(new Dimension(200, (int) (super.getPreferredSize().getHeight())));
		setEditable(false);
	}
}
