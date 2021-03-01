package com.example.repository;

import com.example.model.EventPotionsObtained;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventPotionsObtainedRepository extends JpaRepository<EventPotionsObtained, Integer> {

}
