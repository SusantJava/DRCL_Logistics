package com.drcl.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drcl.model.ShipmentType;
import com.drcl.service.IShipmentTypeService;

@RestController
@RequestMapping("/rest/shipment")
public class ShipmentTypeRestController {
	@Autowired
	IShipmentTypeService service;
	
	//1.Fetch All records from DB
	@GetMapping("/all")
	public ResponseEntity<?>getAll(){
	
		ResponseEntity<?>resp=null;
		//fetch data
		List<ShipmentType>list=service.getAllShipmentTypes();
		if(list!=null && !list.isEmpty()){
			resp=new ResponseEntity<List<ShipmentType>>(list,HttpStatus.OK);
			
			}else {
				resp=new ResponseEntity<String>("No Data Found",HttpStatus.OK);
			}
		return resp;
		
	}

}
