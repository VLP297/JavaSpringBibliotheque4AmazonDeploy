package com.capgemini.showtime.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.showtime.entities.Abonne;
import com.capgemini.showtime.entities.Emprunt;
import com.capgemini.showtime.entities.Livre;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer>{
	
}
