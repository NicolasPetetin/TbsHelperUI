package guiElements.parse.persist;

import java.awt.Color;
import java.awt.Font;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JTable;

public class TbsPersistTable extends JTable {
	private static final long serialVersionUID = -2215172603976972591L;
	private TbsPersistTableModel model;
	
	public TbsPersistTable() {
		model = new TbsPersistTableModel();
		model.setDefaultTable();
		setBackground(Color.LIGHT_GRAY);
		setModel(model);
		setDefaultHeaderFont();
		
		setFillsViewportHeight(true);
		setVisible(true);
	}

	private void setDefaultHeaderFont() {
		Font font = getTableHeader().getFont();
		Map<TextAttribute, ?> attributes = font.getAttributes();
		String family = (String) attributes.get(TextAttribute.FAMILY);
		int size = font.getSize();
		
		Map<TextAttribute, Object> newAttributes = new HashMap<TextAttribute, Object>();
		newAttributes.put(TextAttribute.FAMILY, family);
		newAttributes.put(TextAttribute.SIZE, size);
		newAttributes.put(TextAttribute.WEIGHT, TextAttribute.WEIGHT_BOLD);
		Font defaultFont = Font.getFont(newAttributes);
		getTableHeader().setFont(defaultFont);
	}
}
