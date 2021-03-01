package com.example.repository;

import com.example.model.PotionsObtained;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotionsObtainedRepository extends JpaRepository<PotionsObtained, Integer> {

}
