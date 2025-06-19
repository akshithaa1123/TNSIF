package com.example.sriinducurd.service;

import com.example.sriinducurd.entity.Placement;
import com.example.sriinducurd.repository.PlacementRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepository prepo;

    // inserting data
    public Placement addPlace(Placement place) {
        return prepo.save(place);
    }
    
    //Get data
    public List<Placement> getPlace(){
    	return prepo.findAll();
    }
    
    //update data
    //update set 
    public Placement updatePlace(Placement place){
    	
    	Long id=place.getId();
    	//get id --> user input
    	//findById-->db input
    	Placement place1=prepo.findById(id).get();
    	place1.setName(place.getName());
    	place1.setDate(place.getDate());
    	place1.setQualification(place.getQualification());
    	place1.setYear(place.getYear());
    	place1.setCollege(place.getCollege());
    	return prepo.save(place1);
    }
    
    //delete data
    public void deletePlace(long id) {
    	prepo.deleteById(id);
    }
}