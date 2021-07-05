package com.example.barGraph.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barGraph.Repository.RtoRepository;
import com.example.barGraph.entities.Rtono;

@Service
public class RtonoServiceImpl implements RtonoService{

	 private RtoRepository rtoRepository;
	  

	    @Autowired
	    public RtonoServiceImpl(RtoRepository rtoRepository) {
	        this.rtoRepository = rtoRepository;
	      
	    }


	    @Override
	    public List<Rtono> listAll() {
	        List<Rtono> Rtos = new ArrayList<>();
	        rtoRepository.findAll().forEach(Rtos::add); 
	        return Rtos;
	    }


		
}
