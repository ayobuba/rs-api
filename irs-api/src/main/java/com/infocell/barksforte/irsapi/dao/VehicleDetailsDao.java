package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.VehicleDetails;
import com.infocell.barksforte.irsapi.repositories.VehicleDetailsRepository;

@Service
public class VehicleDetailsDao {
	
	@Autowired
	private VehicleDetailsRepository repo;
	
	
	
	public VehicleDetails save(VehicleDetails obj) {
		
		return repo.save(obj);
	}
	
	public List<VehicleDetails> findAll(){
		return repo.findAll();
	}

	public VehicleDetails findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(VehicleDetails obj) {
		repo.delete(obj);
		
		
	}
}
