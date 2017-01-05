package assignment2;

import java.util.ArrayList;

public class loadTrains implements Command {

	@Override
	public void voerUit(String trainName, String wagonName, int numSeats) {
	   
	}
	public String getTrains(){
		String trains = " ";
		for(Train t : allTrains){
			trains += t.toString() + " ";
	
		}
		return trains;
	}

}
