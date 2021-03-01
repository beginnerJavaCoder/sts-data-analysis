package com.example.repository;

import com.example.model.EventRelicsObtained;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRelicsObtainedRepository extends JpaRepository<EventRelicsObtained, Integer> {

}
