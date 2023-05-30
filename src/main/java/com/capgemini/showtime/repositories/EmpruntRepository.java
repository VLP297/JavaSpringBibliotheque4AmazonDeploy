package com.capgemini.showtime.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.showtime.entities.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer>{
	
}
