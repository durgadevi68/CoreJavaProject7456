package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead,Integer>{

}
