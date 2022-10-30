package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Login;
import com.example.demo.model.Victim;


public interface LoginRepository extends JpaRepository<Login,Long> {
	
	// Login
	@Query("SELECT v FROM Victim v WHERE v.username=:username and v.password=:password") 
	Victim getVictimByName(@Param("username") String name, @Param("password") String password);

}
