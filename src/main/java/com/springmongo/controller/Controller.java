package com.springmongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmongo.model.RegisterModel;
import com.springmongo.repository.RegisterRepository;

@RestController
public class Controller {
	// this is a repository instance. using this we store the values in database
	@Autowired
	RegisterRepository registerRepo;
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public @ResponseBody String registerUser(@RequestBody RegisterModel request) {
		registerRepo.save(request); // this will save one user record into database
		return "congratulations "+ request.getFirstName() + ", your registration is successful";
	}
	
	// for. example: localhost/register/firstname?firstName=vishal
	@RequestMapping(value = "/search/firstname")
	public @ResponseBody RegisterModel findByFirstName(@RequestParam String firstName){
		return registerRepo.findByFirstName(firstName);
	}
	
	// for. example: localhost/register/lastname?lastName=patel
	@RequestMapping(value = "/search/lastname")
	public @ResponseBody List<RegisterModel> findByLastName(@RequestParam String lastName){
		return registerRepo.findByLastName(lastName); // find records by lastname and return
	}
}
