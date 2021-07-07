package enums;

import java.util.ArrayList;
import java.util.List;

public enum ActionComboItems {
	PARSE_STATEMENT("Parser une requête"),
	PARSE_PERSIST("Parser des persistences");

	private String itemLib;
	
	private ActionComboItems(String itemLib) {
		this.itemLib = itemLib;
	}
	
	public String getText() {
		return itemLib;
	}
	
	public static ActionComboItems fromString(String itemLib) {
		for(ActionComboItems item : values()) {
			if(item.getText().equals(itemLib)) {
				return item;
			}
		}
		
		throw new IllegalArgumentException();
	}
	
	public static List<String> allTextValues(){
		List<String> allTextValues = new ArrayList<String>();
		for(ActionComboItems item : values()) {
			allTextValues.add(item.getText());
		}
		return allTextValues;
	}
}
