package com.bridgelabz.fundoonotes.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.fundoonotes.dto.UserDto;
import com.bridgelabz.fundoonotes.service.ServiceInf;

@RestController
public class RegisterController {

	
	@Autowired
	private ServiceInf service;
	



	@GetMapping("/User")
	public String getUser()
	{
		return "Shivani";
	}
	

	@PostMapping("/users/register")
	public UserDto register(@RequestBody UserDto userDto) {
		
		service.register(userDto);
		
		return null;
		
	}
	
}
