package com.example.actor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatdataRepository extends JpaRepository<Catdata, Integer> {

}