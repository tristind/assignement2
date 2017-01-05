package assignment2;

public class RemoveWagon implements Command {
	@Override
	public void voerUit(String trainName, String wagonType ,int numSeats) {
		Train theTrain = null;

		for (Train t : allTrains) {
			if (t.getName().equals(trainName)) {
				theTrain = t;
				break;
			}
		}
		
		for (Wagon w : allWagons) {
			if (w.getType().equals(wagonType)) {
				
				theTrain.removeWagon(w);
				break;
			}
		}
		theTrain.toString();
	   }
	}

