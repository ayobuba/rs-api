package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Title;
import com.infocell.barksforte.irsapi.repositories.TitleRepository;

@Service
public class TitleDao {
	
	@Autowired
	private TitleRepository repo;
	
	
	
	public Title save(Title obj) {
		
		return repo.save(obj);
	}
	
	public List<Title> findAll(){
		return repo.findAll();
	}

	public Title findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Title obj) {
		repo.delete(obj);
		
		
	}
}
