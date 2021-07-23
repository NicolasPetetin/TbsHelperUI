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
		setModel(model);
		setDefaultHeaderFont();
		setEnabled(false);
		setFillsViewportHeight(true);
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
	
	public TbsPersistTableModel getModel() {
		return model;
	}
	
	@Override
	public void setEnabled(boolean enabled) {
		this.setBackground(enabled ? Color.WHITE : Color.LIGHT_GRAY);
		super.setEnabled(enabled);
	}
}
