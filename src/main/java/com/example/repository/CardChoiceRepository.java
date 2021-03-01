package com.example.repository;

import com.example.model.CardChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardChoiceRepository extends JpaRepository<CardChoice, Integer> {

}
