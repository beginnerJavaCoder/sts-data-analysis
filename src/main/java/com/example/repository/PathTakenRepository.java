package com.example.repository;

import com.example.model.PathTaken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PathTakenRepository extends JpaRepository<PathTaken, Integer> {

}
