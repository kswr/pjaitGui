package zad3;

import java.util.LinkedList;

public class Container {
	private LinkedList<String> stack = new LinkedList();
	private boolean addedAllRecords = false;
	
	public void setEnd() {
		this.addedAllRecords = true;
	}
	
	public boolean isEmpty() {
		return this.stack.isEmpty();
	}
	
	public boolean isEnd() {
		return this.addedAllRecords;		
	}
	
	public void addRecord(String record) {
		this.stack.add(record);
	}
	public String getRecord() {
		return this.stack.pop();
	}
}
