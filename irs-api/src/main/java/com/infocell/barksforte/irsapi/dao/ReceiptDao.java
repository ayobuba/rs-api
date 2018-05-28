package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Receipt;
import com.infocell.barksforte.irsapi.repositories.ReceiptRepository;

@Service
public class ReceiptDao {
	
	@Autowired
	private ReceiptRepository repo;
	
	
	
	public Receipt save(Receipt obj) {
		
		return repo.save(obj);
	}
	
	public List<Receipt> findAll(){
		return repo.findAll();
	}

	public Receipt findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Receipt obj) {
		repo.delete(obj);
		
		
	}
}
