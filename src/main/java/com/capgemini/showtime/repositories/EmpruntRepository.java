package com.capgemini.showtime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.capgemini.showtime.entities.Emprunt;

public interface EmpruntRepository extends JpaRepository<Emprunt, Integer>{
	
	@Query(value = "SELECT e.* FROM emprunt e WHERE e.num_abonne=:id", nativeQuery = true)
	List<Emprunt> findEmpruntById(@Param("id") Long id);
}
