package com.example.repository;

import com.example.model.EventCardsUpgraded;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventCardsUpgradedRepository extends JpaRepository<EventCardsUpgraded, Integer> {

}
