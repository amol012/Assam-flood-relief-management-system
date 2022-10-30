package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Shelter;

@Repository
public interface ShelterRepository extends JpaRepository<Shelter ,Long> {


}
