package com.spring.location.service;

import java.util.List;

import com.spring.location.entity.Location;

public interface Locationservice {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationgetById(int id);
	List<Location> getAllLocations();
	

}
