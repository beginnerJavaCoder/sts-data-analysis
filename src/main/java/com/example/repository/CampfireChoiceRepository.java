package com.example.repository;

import com.example.model.CampfireChoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampfireChoiceRepository extends JpaRepository<CampfireChoice, Integer> {

}
