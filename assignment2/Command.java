package assignment2;

import java.util.ArrayList;


public interface Command {
	ArrayList<Train> allTrains = new ArrayList<Train>();
	ArrayList<Wagon> allWagons = new ArrayList<Wagon>();
	
	void voerUit(String trainName, String wagonName,int numSeats);

}
