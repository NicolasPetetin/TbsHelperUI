package model;

import java.util.ArrayList;
import java.util.List;

public class TbsTableData {
	private List<List<String>> data;
	
	public TbsTableData() {
		data = new ArrayList<List<String>>();
	}
	
	public int size() {
		return data.size();
	}
	
	public String getAt(int line, int col) {
		return data.get(line).get(col);
	}
	
	public void clear() {
		data.clear();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	
	public List<String> getLine(int line){
		return data.get(line);
	}
}
