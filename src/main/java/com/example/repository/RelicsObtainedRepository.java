package com.example.repository;

import com.example.model.RelicsObtained;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelicsObtainedRepository extends JpaRepository<RelicsObtained, Integer> {

}
