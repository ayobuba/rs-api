package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Tinseq;
import com.infocell.barksforte.irsapi.repositories.TinseqRepository;

@Service
public class TinseqDao {
	
	@Autowired
	private TinseqRepository repo;
	
	
	
	public Tinseq save(Tinseq obj) {
		
		return repo.save(obj);
	}
	
	public List<Tinseq> findAll(){
		return repo.findAll();
	}

	public Tinseq findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Tinseq obj) {
		repo.delete(obj);
		
		
	}
}
