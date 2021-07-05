package com.example.barGraph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.barGraph.entities.Rtono;
import com.example.barGraph.entities.Stateno;
import com.example.barGraph.services.ProductService;
import com.example.barGraph.services.RtonoService;
import com.example.barGraph.services.Statenoservice;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Controller
public class GraphController {
	 private RtonoService rtonoService;
	 private ProductService productService;
	 
	 private Statenoservice statenoservice;
	 
	  @Autowired
	    public void setStatenoservice(Statenoservice statenoservice) {
	        this.statenoservice = statenoservice;
	    }

      

	    @Autowired
	    public void setProductService(ProductService productService) {
	        this.productService = productService;
	    }
	    
	    @Autowired
	    public void setRtonoService(RtonoService rtonoService) {
	        this.rtonoService = rtonoService;
	    }

	    
	    
	 


	    @CrossOrigin
	    @GetMapping({"/landing-page","/"})
	    public String listProducts(Model model){
	        model.addAttribute("products", productService.listAll());
	        return "landing-page";
	    }

	
	    
	
	       @CrossOrigin()
	        @GetMapping("/**")
		    @ResponseBody
		    public String getDatadb1() {
		    	List<Rtono> dataList=rtonoService.listAll();
		    	List<Stateno> dataList3=statenoservice.listAll();
		    	JsonArray jsonstate1=new JsonArray();
		    	JsonArray RtoCount= new JsonArray();
		    	JsonArray rtono= new JsonArray();
		    	JsonArray jsonstate=new JsonArray();
		    	JsonArray jsoncountno= new JsonArray();
		    	
		    	JsonObject jsonObject1= new JsonObject();
		    	
		    	dataList.forEach(data->{
		    		jsonstate1.add(data.getStatecode());
		    	     RtoCount.add(data.getRtocount());
		    		 rtono.add(data.getRtocode());
		    		
		    	});
		    	dataList3.forEach(data->{
		    		jsonstate.add(data.getStatecode());
		    		jsoncountno.add(data.getCountno());
		    		
		    		
		    	});
		      jsonObject1.add("stateag",jsonstate1);
		      jsonObject1.add("RtoCount",RtoCount);
		      jsonObject1.add("Rtono",rtono);
		      jsonObject1.add("state",jsonstate);
		      jsonObject1.add("count",jsoncountno);
		      
		    	
		    
	    	return jsonObject1.toString(); 
			   
			     
	
	
	
	
	
		}

	        
}
	        

	


