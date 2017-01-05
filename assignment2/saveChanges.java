	package assignment2;


	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
	import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Statement;

public class saveChanges  implements Command {
	Train theTrain = null;
	Wagon theWagon = null;

	int teller = 0;

	@Override
	public void voerUit(String trainName, String wagonType, int numSeats) {

		     
		     for(Wagon w : allWagons){

			 
		     }
		    

		     for (Train t : allTrains) {
		    	ArrayList<Wagon> thisTrainWagons = new ArrayList<Wagon>();
				thisTrainWagons =(ArrayList<Wagon>) t.getMyWagons();
				
				if(t.getMyWagons() != null){
				for(Wagon w : thisTrainWagons){
					teller++;
				}}
				
				for(int i = teller ;i<10;i++){

				}

				 teller = 0;
				};


	}



}

