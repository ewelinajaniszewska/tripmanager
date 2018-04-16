package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {
	
	
	Collection <Trip> trips = new ArrayList <Trip>();

	public void addTrip(Trip trip){
		trips.add(trip);
	}
	
	public Collection <Trip> getTrips() {
		return trips;
	}
	
	public void removeTrip(Trip trip){
		trips.remove(trip);
	}

	
	public String findTrip (String tripName){
		String foundTrip = null;
		for (Trip t:trips){
			if (t.getName().equals(tripName))
			foundTrip = t.getName();
		
		}
		return foundTrip;
		
		
	}
	
}

	
