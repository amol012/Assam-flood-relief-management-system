package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Volunteer;

@Repository
public interface VolunteerRepository extends JpaRepository<Volunteer ,Long>{
	
	@Query("SELECT v FROM Volunteer v WHERE v.username=:username and v.password=:password") //Login
	Optional<Volunteer> getVolunteer(@Param("username") String name, @Param("password") String password);

}
