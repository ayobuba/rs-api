package com.infocell.barksforte.irsapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infocell.barksforte.irsapi.entities.Title;

public interface TitleRepository extends JpaRepository<Title, Integer> {

}
