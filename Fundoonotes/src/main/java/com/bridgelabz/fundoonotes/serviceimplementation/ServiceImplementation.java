package com.bridgelabz.fundoonotes.serviceimplementation;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.auth0.jwt.exceptions.JWTVerificationException;
import com.bridgelabz.fundoonotes.dto.UserDto;
import com.bridgelabz.fundoonotes.model.User;
import com.bridgelabz.fundoonotes.model.UserLogin;
import com.bridgelabz.fundoonotes.repository.UserRepository;
import com.bridgelabz.fundoonotes.service.ServiceInf;
import com.bridgelabz.fundoonotes.utility.JwtGenerator;

@Service
public class ServiceImplementation implements ServiceInf {

	private static final Logger loggger = LoggerFactory.getLogger(ServiceImplementation.class);
	@Autowired
	private User user;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private JwtGenerator jwtGenerator;
	
	@Autowired
	private JavaMailSender javamailSender;

	@Override
	public boolean register(UserDto userDto) {
		try {

			user.setFirstName(userDto.getFirstName());
			user.setLastName(userDto.getLastName());
			user.setEmail(userDto.getEmail());
			user.setPhoneNumber(userDto.getPhoneNumber());
			user.setPassword(userDto.getPassword());

//			BeanUtils.copyProperties(userDto, user);
			userRepository.save(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public User login(UserLogin userLogin) {
		User user = userRepository.checkByEmail(userLogin.getEmail());
		System.out.println(user + userLogin.getEmail());
		if (user.getEmail().equalsIgnoreCase(userLogin.getEmail())) {
			System.out.println("sucessfully login");
		}

		return user;
	}

	@Override
	public Map<String, Object> findByUserId(int id) {
		User isUserAvailable = userRepository.findById(id);
		System.out.println("User Available"+isUserAvailable);
		return (Map<String, Object>) isUserAvailable;

	}

	@Override
	public boolean verify(String token) {
		try {
			System.out.println("Inside");
			loggger.info("Id Varification", (int) jwtGenerator.parse(token));
			int id = jwtGenerator.parse(token);
			System.out.println(token);
			User isIdValied = userRepository.findById(id);
			if (isIdValied.isVerified()) {
				user.setVerified(true);
				userRepository.save(user);
				System.out.println("save details");
				return true;
			}

		} catch (JWTVerificationException | IllegalArgumentException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<User> findAllDetails() {
		return userRepository.findAll();
	}
	
	public void sendMail()
	{
		SimpleMailMessage simpleMsg=new SimpleMailMessage();
		simpleMsg.setTo("shivani@gmail.com","nidhi@gmail.com","akash@gmail.com");
		simpleMsg.setSubject("Forget password");
		simpleMsg.setText("Click here");
		javamailSender.send(simpleMsg);
	}
	
}




