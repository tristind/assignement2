package assignment2;

public class DeleteTrain implements Command {
	@Override
	public void voerUit(String trainName, String wagonType ,int numSeats) {
		
		for (Train t : allTrains) {
			if (t.getName().equals(trainName)) {
				allTrains.remove(t);
				break;
			}
		}
		allTrains.toString();
	   }
	}

