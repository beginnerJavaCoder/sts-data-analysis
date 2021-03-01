package com.example.repository;

import com.example.model.BossRelic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BossRelicRepository extends JpaRepository<BossRelic, Integer> {

}
