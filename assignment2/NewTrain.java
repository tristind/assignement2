package assignment2;

public class NewTrain implements Command {
	@Override
	   public void voerUit(String trainName, String wagonType ,int numSeats) {
			Train train = new Train(trainName);
			allTrains.add(train);
			train.toString();
			
	   }
	}

