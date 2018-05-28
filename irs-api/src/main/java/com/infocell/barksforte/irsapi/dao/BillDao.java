package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.repositories.BillRepository;

@Service
public class BillDao {
	
	@Autowired
	private BillRepository repo;
	
	
	
	public Bill save(Bill obj) {
		
		return repo.save(obj);
	}
	
	public List<Bill> findAll(){
		return repo.findAll();
	}

	public Bill findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Bill obj) {
		repo.delete(obj);
		
		
	}
}
