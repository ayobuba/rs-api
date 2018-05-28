package com.infocell.barksforte.irsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infocell.barksforte.irsapi.entities.BillItem;

public interface BillItemRepository extends JpaRepository<BillItem, Integer> {

}
