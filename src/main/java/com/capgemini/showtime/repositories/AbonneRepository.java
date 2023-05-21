package com.capgemini.showtime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.showtime.entities.Abonne;
import com.capgemini.showtime.entities.Emprunt;

public interface AbonneRepository extends JpaRepository<Abonne, Integer>{

}
