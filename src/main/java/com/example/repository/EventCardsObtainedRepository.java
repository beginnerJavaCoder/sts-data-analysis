package com.example.repository;

import com.example.model.EventCardsObtained;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCardsObtainedRepository extends JpaRepository<EventCardsObtained, Integer> {

}
