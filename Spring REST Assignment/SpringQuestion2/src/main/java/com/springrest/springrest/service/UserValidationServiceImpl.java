package com.springrest.springrest.service;

import org.springframework.stereotype.Service;

@Service
public class UserValidationServiceImpl implements UserValidationService {

	@Override
	public boolean isUserValid(String user, String password) {
		if (user.equals("Nitesh") && password.equals("Nitesh")) {
			return true;
		}
		return false;
	}

}
