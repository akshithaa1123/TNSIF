package com.example.sriinducurd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sriinducurd.entity.Placement;
import com.example.sriinducurd.service.PlacementService;

@RestController
public class PlacementController {
	@Autowired
	private PlacementService pser;
	
	//adding data
	@PostMapping("/addplace")
	public Placement regPlace(@RequestBody Placement place) {
		return pser.addPlace(place);
	}
	
	//Get data
	@GetMapping("/getplace")
	public List<Placement>getPlacement(){
		return pser.getPlace();
	}
	
	//update data
	@PutMapping("/updateplace")
	public Placement updatePlacement(@RequestBody Placement place) {
		return pser.updatePlace(place);
	}
	
	//delete
	@DeleteMapping("/deleteplace/(id)")
	public void deletePlacement(@PathVariable Long id){
		pser.deletePlace(id);
	}
}
