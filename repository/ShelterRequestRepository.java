package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;



import org.springframework.stereotype.Repository;

import com.example.demo.model.ShelterRequest;


@Repository
public interface ShelterRequestRepository extends JpaRepository<ShelterRequest,Long>{

}
