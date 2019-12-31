package com.bridgelabz.fundoonotes.service;

import com.bridgelabz.fundoonotes.dto.UserDto;
import com.bridgelabz.fundoonotes.model.User;
import com.bridgelabz.fundoonotes.model.UserLogin;

public interface ServiceInf {
	public boolean register(UserDto userDto);
	public User login(UserLogin userLogin);
}
