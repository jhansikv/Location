package com.spring.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.location.entity.Location;
import com.spring.location.respos.LocationRepository;
@Service
public class LocationserviceImpl implements Locationservice {
	@Autowired
	LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);

	}

	@Override
	public Location getLocationgetById(int id) {
		
		return locationRepository.findById(id).get();
		
		}

	@Override
	public List<Location> getAllLocations() {
		
		return locationRepository.findAll();
	}

}
