package com.raj.springboot.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.raj.springboot.app.pojo.*;

@Component
public class UserDaoService {

	public static int uniqNo = 1;
	private static List<User> userList=new ArrayList<>();
	
	static {
		userList.add(new User(1,"RAj", "Singh", "India", true));
		userList.add(new User(2,"Rana", "Pratap", "India", false));
		userList.add(new User(3,"Ram", "Singh", "India", false));
		userList.add(new User(4,"RAj", "Sharma", "India", false));
		userList.add(new User(5,"Rajesh", "Singh", "India", false));
		userList.add(new User(6,"RAju", "Singh", "India",false));
		uniqNo = 6;
	}
	
	public List<User> getUserList(){
		return userList;
	}
	
	public User addUser(User user) {
		user.setId(++uniqNo);;
		userList.add(user);
		return user;
	}
	
	public User findOne(int id) {
		
		for(User user:userList) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
}
