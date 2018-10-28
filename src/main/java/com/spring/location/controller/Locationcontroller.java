package com.spring.location.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.location.entity.Location;
import com.spring.location.service.Locationservice;

@Controller
public class Locationcontroller {
	
	@Autowired
	Locationservice service;
	
	@RequestMapping("/hello")
	public String index() {
		
		return "This is my first spring boot";
		
	}
	
	@RequestMapping("/showcreate")
	public String showcreate() {
		return "createLocation";
	}

	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location")Location location, ModelMap modelmap) {
		Location locationsaved = service.saveLocation(location);
		
		
		String msg="Location saved with ID :" +locationsaved.getId();
		modelmap.addAttribute("msg",msg);
		return "createLocation";
		
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelmap) {
		List<Location> locations =service.getAllLocations();
		modelmap.addAttribute("location", locations);
		return "displayLocation";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocations(@RequestParam("id")int id, ModelMap modelmap) {
		
		/*instead of @RequestParam 
		 * Location location = new Loction();
		 * location.setId(id);
		*/
		Location location =service.getLocationgetById(id);
		service.deleteLocation(location);	
		List <Location> locations  =service.getAllLocations();
		modelmap.addAttribute("location", locations);
		
		return "displayLocation";
		
	}
	
	@RequestMapping("/showupdate")
	public String showupdate(@RequestParam("id")int id, ModelMap modelmap) {
		Location location = service.getLocationgetById(id);
		modelmap.addAttribute("location", location);
		System.out.println("3");
			return "updateLocation";
	}
	
	@RequestMapping("/updateloc")
	public String updateLocation(@ModelAttribute("location")Location location, ModelMap modelmap) {
		 service.updateLocation(location);
		 List<Location> locations = service.getAllLocations();
		modelmap.addAttribute("location",locations);
		return "displayLocation";
	}
	

}
