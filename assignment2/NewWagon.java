package assignment2;

public class NewWagon implements Command {

	@Override
	public void voerUit(String trainName, String wagonType ,int numSeats) {
			Wagon wagon = new Wagon(numSeats , wagonType);
			allWagons.add(wagon);
			wagon.toString2();
	   }
	}

