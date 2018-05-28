package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.VehicleModel;
import com.infocell.barksforte.irsapi.repositories.VehicleModelRepository;

@Service
public class VehicleModelDao {
	
	@Autowired
	private VehicleModelRepository repo;
	
	
	
	public VehicleModel save(VehicleModel obj) {
		
		return repo.save(obj);
	}
	
	public List<VehicleModel> findAll(){
		return repo.findAll();
	}

	public VehicleModel findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(VehicleModel obj) {
		repo.delete(obj);
		
		
	}
}
