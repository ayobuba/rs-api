package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Device;
import com.infocell.barksforte.irsapi.repositories.DeviceRepository;

@Service
public class DeviceDao {
	
	@Autowired
	private DeviceRepository repo;
	
	
	
	public Device save(Device obj) {
		
		return repo.save(obj);
	}
	
	public List<Device> findAll(){
		return repo.findAll();
	}

	public Device findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Device obj) {
		repo.delete(obj);
		
		
	}
}
