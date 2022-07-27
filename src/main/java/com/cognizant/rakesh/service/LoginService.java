package com.cognizant.rakesh.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("Rakesh")
				&& password.equalsIgnoreCase("abc123");
	}

}
