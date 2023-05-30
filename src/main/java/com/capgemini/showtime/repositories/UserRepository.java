package com.capgemini.showtime.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.showtime.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	User findByLoginAndPassword(String login, String password);
}
