package com.bridgelabz.fundoonotes.serviceimplementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.fundoonotes.dto.UserDto;
import com.bridgelabz.fundoonotes.model.User;
import com.bridgelabz.fundoonotes.repository.UserRepository;
import com.bridgelabz.fundoonotes.service.ServiceInf;

@Service
public class ServiceImplementation implements ServiceInf{
	
	@Autowired
	private User user;
	
	@Autowired
	private UserRepository userRepository; 
	
	 @Override
	public void register(UserDto userDto) {
		try {
			/*
			 * user.setFirstName(userDto.getFirstName());
			 * user.setLastName(userDto.getLastName()); user.setEmail(userDto.getEmail());
			 * user.setPhoneNumber(userDto.getPhoneNumber());
			 * user.setPassword(userDto.getPassword());
			 */
			BeanUtils.copyProperties(userDto, User.class);
			userRepository.save(user);
		} catch (Exception e) {
		}
	}

	
	
}
