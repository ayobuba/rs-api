package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.BillItem;
import com.infocell.barksforte.irsapi.repositories.BillItemRepository;

@Service
public class BillItemDao {
	
	@Autowired
	private BillItemRepository repo;
	
	
	
	public BillItem save(BillItem obj) {
		
		return repo.save(obj);
	}
	
	public List<BillItem> findAll(){
		return repo.findAll();
	}

	public BillItem findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(BillItem obj) {
		repo.delete(obj);
		
		
	}
}
