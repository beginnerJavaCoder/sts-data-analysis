package com.example.repository;

import com.example.model.EventRelicsLost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRelicsLostRepository extends JpaRepository<EventRelicsLost, Integer> {

}
