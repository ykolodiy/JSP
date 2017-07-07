package amazon.service;

import java.util.HashMap;

import amazon.dto.User;

//here we do authentication just check if password null or not.. no real db connection
public class LoginService {

	
	//Initialize some variable in constructor
	HashMap<String, String> users = new HashMap<String, String>();
	public LoginService () {
		
		users.put("suka1", "suka ru1");
		users.put("suka2", "suka ru2");
		users.put("suka3", "suka ru3");
		users.put("suka4", "suka ru4");
		
		
		
		
		
	}
	
	
	public boolean authenticate (String userId, String password) {
		
		if (password == null || password.trim() == "") {return false;}
		
		return true;
		
		
	}
	
	
	public User getuserdetails (String userId) {
		User user = new User ();
		
		user.setUserName(users.get(userId));
		
		user.setUserId(userId);
		return user;
		
		
	}
	
	
	
	
}
