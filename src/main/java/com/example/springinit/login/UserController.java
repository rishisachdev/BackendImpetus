package com.example.springinit.login;
//import com.example.springinit.login.service.DistributorService;
//import com.example.springinit.login.service.UserService;
import com.example.springinit.response.LoginResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.springinit.login.dto.LoginDTO;
//import com.example.springinit.login.dto.DistributorDTO;
import com.example.springinit.login.dto.UserDTO;
import com.example.springinit.login.service.impl.*;
@RestController
@CrossOrigin(origins="http://localhost:3000/")
@RequestMapping("/registeruser")

public class UserController
{
	@Autowired
	private UserService userService;
	@PostMapping(path="/save")
	public String save(@RequestBody UserDTO dto)
	{
		String id= userService.addUser(dto);
		return id;
	}
	@GetMapping (path = "/login")
	public ResponseEntity<?>loginEmployee(@RequestBody LoginDTO loginDTO)
	{
	LoginResponse loginResponse = userService.loginUser(loginDTO);
	return ResponseEntity.ok(loginResponse);
}
	}
