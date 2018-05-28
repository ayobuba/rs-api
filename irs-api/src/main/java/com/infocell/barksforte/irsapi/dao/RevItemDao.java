package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.RevItem;
import com.infocell.barksforte.irsapi.repositories.RevItemRepository;

@Service
public class RevItemDao {
	
	@Autowired
	private RevItemRepository repo;
	
	
	
	public RevItem save(RevItem obj) {
		
		return repo.save(obj);
	}
	
	public List<RevItem> findAll(){
		return repo.findAll();
	}

	public RevItem findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(RevItem obj) {
		repo.delete(obj);
		
		
	}
}
