package com.infocell.barksforte.irsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infocell.barksforte.irsapi.entities.Receipt;

public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {

}
