package com.example.repository;

import com.example.model.Relic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelicRepository extends JpaRepository<Relic, Integer> {

}
