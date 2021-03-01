package com.example.repository;

import com.example.model.PathPerFloor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathPerFloorRepository extends JpaRepository<PathPerFloor, Integer> {

}
