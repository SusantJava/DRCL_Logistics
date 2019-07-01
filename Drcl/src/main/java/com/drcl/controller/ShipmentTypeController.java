package com.drcl.controller;

import java.util.Collections;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.drcl.model.ShipmentType;
import com.drcl.service.IShipmentTypeService;
import com.drcl.view.ShipmentTypeExcelView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;
	@Autowired
	private ServletContext servletContext;
	
	//To display Reg Form
	@RequestMapping("/register")
	public String showRegPage(ModelMap map) {
		//Form Backing Object
		map.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegister";
	}
	
	/*
	 * This Method will be called on submit button click
	 * 
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveShipment(ModelMap map,@ModelAttribute("shipmentType")ShipmentType shipmentType) {
		Integer id=service.saveShipmentType(shipmentType);
		String message= "Shipment "+id+" saved successfully";
		map.addAttribute("msg", message);
		//clear Form Backing Object
				map.addAttribute("shipmentType", new ShipmentType());
		return "ShipmentTypeRegister";
		}
	@RequestMapping("/all")
	public String showAll(ModelMap map) {
		// Call Service Methods
	List<ShipmentType>obs=service.getAllShipmentTypes();
	map.addAttribute("list",obs);
		return "ShipmentTypeData";
	}
	//3.Delete Data based on ID
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id")Integer shipmentId,ModelMap map) {
		service.deleteShipmentType(shipmentId);
		map.addAttribute("list", service.getAllShipmentTypes());
		map.addAttribute("msg ",shipmentId+" deleted Successfully" );
		return "ShipmentTypeData";
	}
	//Export to Excel(All rows or id based)
	@RequestMapping("/excel")
	public ModelAndView doExportExcel(@RequestParam(value="id",required=false,defaultValue="0")Integer id) {
		ModelAndView m= new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		if(id==0) {
			m.addObject("shipmentType",service.getAllShipmentTypes());
		}else {
			m.addObject("shipmentType", Collections.singletonList(service.getShipmentTypeById(id)));
		}
		return m;
	}
	

}
