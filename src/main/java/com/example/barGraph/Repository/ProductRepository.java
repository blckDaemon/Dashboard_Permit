package com.example.barGraph.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.barGraph.entities.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}
