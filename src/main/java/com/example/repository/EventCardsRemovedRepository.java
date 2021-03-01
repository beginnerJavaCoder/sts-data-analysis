package com.example.repository;

import com.example.model.EventCardsRemoved;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCardsRemovedRepository extends JpaRepository<EventCardsRemoved, Integer> {

}
