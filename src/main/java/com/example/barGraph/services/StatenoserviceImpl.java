package com.example.barGraph.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.barGraph.Repository.StateRepository;
import com.example.barGraph.entities.Stateno;
@Service
public class StatenoserviceImpl implements Statenoservice {

	
	  private StateRepository stateRepository;
	

	  
	  

	    @Autowired
	    public StatenoserviceImpl(StateRepository stateRepository) {
	        this.stateRepository =stateRepository;
	      
	    }


	    @Override
	    public List<Stateno> listAll() {
	        List<Stateno> states = new ArrayList<>();
	        stateRepository.findAll().forEach(states::add); 
	        return states;
	    }


		

}
