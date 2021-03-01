package com.example.repository;

import com.example.model.GoldPerFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoldPerFloorRepository extends JpaRepository<GoldPerFloor, Integer> {

}
