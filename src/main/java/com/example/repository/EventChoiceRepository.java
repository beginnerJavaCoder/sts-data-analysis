package com.example.repository;

import com.example.model.EventChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventChoiceRepository extends JpaRepository<EventChoice, Integer> {

}
