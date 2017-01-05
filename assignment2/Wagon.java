package assignment2;

public class Wagon {
	private int numseats;
	private String type;
	
	public Wagon(int numseats , String type){
		this.numseats = numseats;
		this.type = type;
	}

	public int getNumseats() {
		return numseats;
	}

	public void setNumseats(int numseats) {
		this.numseats = numseats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String toString(){
		String s = " ("+ type +") -";
		return s;
		
	}
	public String toString2(){
		String s = "type "+ type +" het aantal stoelen" + numseats;
		System.out.println(s);
		return s;
		
	}


	}