package com.example.springinit.login.service.impl;

import com.example.springinit.login.dto.LoginDTO;
import com.example.springinit.login.dto.UserDTO;
import com.example.springinit.response.LoginResponse;

public interface UserService {
	String addUser(UserDTO dtO);
	LoginResponse loginUser (LoginDTO loginDTO);
}
