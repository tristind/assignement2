package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Train {
	private String name;
	
	private ArrayList<Wagon> myWagons = new ArrayList<Wagon>();
	
	public Train(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Wagon> getMyWagons() {
		return myWagons;
	}
	public void addWagon(Wagon theWagon){
		myWagons.add(theWagon);
	}
	public void removeWagon(Wagon w){
		myWagons.remove(w);
	}
	public String toString(){
		String s = "("+  name + ")"+ " - " ;
		
//		for(Wagon w : myWagons){
//			s += w.toString() + " ";
//			
//		}
//		System.out.println(s);
		return s;
	}
	


	
	

}
