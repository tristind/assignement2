package assignment2;

public class loadTrainAndWagons implements Command{


		@Override
		public void voerUit(String trainName, String wagonName, int numSeats) {
		   
		}
		public String getTrainsAndWagons(){
			String trainsAndWagons = " ";
			
			for(Train t : allTrains){
				trainsAndWagons += t.getName() + "" ;
					for(Wagon w : t.getMyWagons()){
					
							trainsAndWagons += w+ " " ;
						}
					
					trainsAndWagons += "\n";
					}
					
					
				
					
				
			
			
			return trainsAndWagons;
		}

}
