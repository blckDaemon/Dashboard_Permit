package com.example.barGraph.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.barGraph.entities.Stateno;
@Repository
public interface StateRepository extends CrudRepository<Stateno,Integer> {

}
