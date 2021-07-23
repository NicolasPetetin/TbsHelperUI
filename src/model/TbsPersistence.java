package model;

import java.util.HashMap;
import java.util.Map;

public class TbsPersistence {
	private Map<String, String> values;
	
	public TbsPersistence() {
		values = new HashMap<String, String>();
	}
	
	public void add(String name, String value) {
		values.put(name, value);
	}
	
	public String get(String name) {
		return values.get(name);
	}
	
	public void clear() {
		values = new HashMap<String, String>();
	}
	
	public boolean exists(String name) {
		return values.containsKey(name);
	}
	
	public Map<String, String> getValues(){
		return values;
	}
}
