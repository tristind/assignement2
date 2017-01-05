package assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class controller {
	private String command;
	AddWagon AddWagon = new AddWagon();
	DeleteTrain DeleteTrain = new DeleteTrain();
	NewTrain NewTrain = new NewTrain();
	NewWagon NewWagon = new NewWagon();
	RemoveWagon RemoveWagon = new RemoveWagon();
	saveChanges saveChanges = new saveChanges();
	loadTrains loadTrains = new loadTrains();
	LoadWagons LoadWagons = new LoadWagons();
	loadTrainAndWagons loadTrainAndWagons = new loadTrainAndWagons();




	public controller() {
		
	}

	public void forwardCommand(String command) {
		String[] text = command.split("\\s+");
		System.out.println(text[0]);
		
		
		// New train ...... New Wagon
		if (text[0].equals("new")) {
			if (text[1].equals("train")) {
				NewTrain.voerUit(text[2], "", 0);
				System.out.println(text[0]);
			} else if (text[1].equals("wagon")) {
				NewWagon.voerUit("null", text[2], Integer.parseInt(text[3]));
			} else {
				System.out.println(" train unknown command");
			}
		}

		// addWagon
		else if (text[0].equals("add")) {
			if (text[2].equals("to")) {
				AddWagon.voerUit(text[3], text[1], 0);
			} else {
				System.out.println("unknown command");
			}
		}
		// delete Train
		else if (text[0].equals("delete")) {
			if (text[1].equals("train")) {
				DeleteTrain.voerUit(text[2], "", 0);
			} else {
				System.out.println("unknown command");
			}
		}
		// remove wagon
		if (text[0].equals("remove")) {
			if (text[2].equals("from")) {
				RemoveWagon.voerUit(text[3], text[1], 0);
			} else {
				System.out.println("unknown command");
			}
		}
		
		// save trains/wagons
		if (text[0].equals("save")) {
				saveChanges.voerUit(null,null,0);
		}
		else{
			System.out.println(" else unknown command");
		}
	}
	public String loadTrains() {
			return loadTrains.getTrains();
		
	}
	public String LoadWagons() {
		return LoadWagons.getWagons();
	
}
	public String loadTrainsAndWagons() {
		return loadTrainAndWagons.getTrainsAndWagons();
	
}
}

	

