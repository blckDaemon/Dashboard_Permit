package com.example.barGraph.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barGraph.Repository.ProductRepository;
import com.example.barGraph.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
  

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
      
    }


    @Override
    public List<Product> listAll() {
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(products::add); 
        return products;
    }


	

}
