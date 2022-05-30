package com.raj.springboot.app;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raj.springboot.app.dao.EmailDaoService;
import com.raj.springboot.app.dao.UserDaoService;
import com.raj.springboot.app.pojo.User;

@RestController
@RequestMapping("api/v1/data")
public class MyController {
	@Autowired
	private UserDaoService userService;
	
	@Autowired
	private EmailDaoService emailService;

	@GetMapping("/todos")
	public List<User> todos() {
		return userService.getUserList();
	}
	
	@GetMapping("/todos/{id}")
	public User findOne(@PathVariable int id) {
		return userService.findOne(id);
	}
	
	@PostMapping("/todos")
	public User addUser(@RequestBody User user) {
		User savedUser =userService.addUser(user); 
		return  savedUser;
	}
	
	 @RequestMapping(value = "/sendemail")
	 public String sendEmail() throws AddressException, MessagingException, IOException {
		 emailService.sendmail();
		 return "Email sent successfully...";
	 }   
}
