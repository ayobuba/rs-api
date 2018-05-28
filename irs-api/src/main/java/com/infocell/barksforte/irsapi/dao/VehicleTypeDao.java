package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.VehicleType;
import com.infocell.barksforte.irsapi.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeDao {
	
	@Autowired
	private VehicleTypeRepository repo;
	
	
	
	public VehicleType save(VehicleType obj) {
		
		return repo.save(obj);
	}
	
	public List<VehicleType> findAll(){
		return repo.findAll();
	}

	public VehicleType findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(VehicleType obj) {
		repo.delete(obj);
		
		
	}
}
