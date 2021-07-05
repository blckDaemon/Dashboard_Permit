package com.example.barGraph.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.barGraph.entities.Rtono;

@Repository
public interface RtoRepository extends CrudRepository<Rtono, Integer> {

}
