package com.infocell.barksforte.irsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infocell.barksforte.irsapi.entities.Months;

public interface MonthsRepository extends JpaRepository<Months, Integer> {

}
