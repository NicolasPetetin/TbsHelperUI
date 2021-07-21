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
	
	public void get(String name) {
		values.get(name);
	}
	
	public void clear() {
		values = new HashMap<String, String>();
	}
	
	public boolean exists(String name) {
		return values.containsKey(name);
	}
}
