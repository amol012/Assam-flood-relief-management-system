package com.example.demo.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Organization;
import com.example.demo.model.Victim;


@Repository
public interface OrganizationRepository extends JpaRepository<Organization ,Long> {
	
	@Query("SELECT v FROM Organization v WHERE v.username=:username and v.password=:password") //Login
	Optional<Organization> getOrganization(@Param("username") String name, @Param("password") String password);
	
	

}
