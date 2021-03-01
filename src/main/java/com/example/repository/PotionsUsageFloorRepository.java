package com.example.repository;

import com.example.model.PotionsUsageFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PotionsUsageFloorRepository extends JpaRepository<PotionsUsageFloor, Integer> {

}
