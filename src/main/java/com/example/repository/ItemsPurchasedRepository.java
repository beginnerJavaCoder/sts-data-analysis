package com.example.repository;

import com.example.model.ItemsPurchased;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsPurchasedRepository extends JpaRepository<ItemsPurchased, Integer> {

}
