package bsu.rfe.java.group8.lab1.Romanova.var16;

public class NewFood {
	String name = null;
	public int count=0;
	public NewFood(String name) {
		this.name = name;
	}
	
	public boolean equals(Object arg0) {
		if (!(arg0 instanceof NewFood)) return false; 
		if (name==null || ((NewFood)arg0).name==null) return false; 
		else {
		return name.equals(((NewFood)arg0).name); 
		} 
		
	}
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void consume() {
		System.out.print(this);
	}
}

