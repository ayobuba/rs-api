package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.BillItemTotal;
import com.infocell.barksforte.irsapi.repositories.BillItemTotalRepository;

@Service
public class BillItemTotalDao {
	
	@Autowired
	private BillItemTotalRepository repo;
	
	
	
	public BillItemTotal save(BillItemTotal obj) {
		
		return repo.save(obj);
	}
	
	public List<BillItemTotal> findAll(){
		return repo.findAll();
	}

	public BillItemTotal findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(BillItemTotal obj) {
		repo.delete(obj);
		
		
	}
}
