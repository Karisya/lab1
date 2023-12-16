package bsu.rfe.java.group8.lab1.Romanova.var16;

public class Potatoes extends NewFood {
	private String type;
	static int count=0;
	public Potatoes(String type) {
		super("Картошка");
		this.type=type;

	}
	
	public void consume() {
		System.out.println(this+"съедено");
	}
	public String getSize() {
		return type;
	}
	public void setSize(String type) {
		this.type=type;
	}
	
//	public boolean equals(Object arg0) {
//		if (super.equals(arg0)) {
//		if (!(arg0 instanceof Potatoes)) return false;
//			
//		return type.equals(((Potatoes)arg0).type); 
//		} else
//		return false;
//		}

	
		public String toString() {
		return super.toString() + " типа " + type + " ";
		}
		
}
