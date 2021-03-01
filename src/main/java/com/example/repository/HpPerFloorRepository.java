package com.example.repository;

import com.example.model.HpPerFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HpPerFloorRepository extends JpaRepository<HpPerFloor, Integer> {

}
