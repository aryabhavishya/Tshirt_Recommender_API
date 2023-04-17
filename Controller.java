package com.assignment.tshirtdetails.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.tshirtdetails.entities.TshirtData;
import com.assignment.tshirtdetails.service.TshirtService;

@RestController
public class Controller {

	@Autowired
	private TshirtService tservice;
	@GetMapping("/tshirt") 
	public List<TshirtData> getSome(@RequestParam String colour, @RequestParam String size, @RequestParam String gender,@RequestParam String outputpref )
	{
		return tservice.getSome(colour,size,gender,outputpref.toUpperCase());
	}
	@PostMapping("/tshirt")
	public void addTshirt(@RequestBody TshirtData tdata)
	{
		tservice.addTshirt(tdata);
	}
}
