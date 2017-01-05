package assignment2;

public class AddWagon implements Command {
	@Override
	public void voerUit(String trainName, String wagonType, int numSeats) {
		Train theTrain = null;
		Wagon theWagon = null;

		for (Train t : allTrains) {
			if (t.getName().equals(trainName)) {
				theTrain = t;
				break;
			}
		}
		
		for (Wagon w : allWagons) {
			if (w.getType().equals(wagonType)) {
				theWagon = w;
				break;
			}
		}

		theTrain.addWagon(theWagon);
		
		theTrain.toString();
		

	}
}
