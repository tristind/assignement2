package assignment2;


import java.util.ArrayList;

public class LoadWagons implements Command {

	@Override
	public void voerUit(String trainName, String wagonName, int numSeats) {
	   
	}
	public String getWagons(){
		String wagons = " ";
		for(Wagon w : allWagons){
			wagons += w.toString() + " ";
	
		}
		return wagons;
	}

}
