package com.example.repository;

import com.example.model.MasterDeck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterDeckRepository extends JpaRepository<MasterDeck, Integer> {

}
