package com.example.repository;

import com.example.model.ItemsPurged;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsPurgedRepository extends JpaRepository<ItemsPurged, Integer> {

}
