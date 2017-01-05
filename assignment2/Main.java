package assignment2;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	




	public static void main(String[] args) {

		DeleteTrain DeleteTrain = new DeleteTrain();
		AddWagon AddWagon = new AddWagon();
		
		NewTrain NewTrain = new NewTrain();
		NewWagon NewWagon = new NewWagon();
		RemoveWagon RemoveWagon = new RemoveWagon();
		
		NewTrain.voerUit("tr1", "", 0);
		NewWagon.voerUit("null","wg1",20);
		AddWagon.voerUit("tr1", "wg1", 0);
		AddWagon.voerUit("tr1", "wg1", 0);
	
	}

}
