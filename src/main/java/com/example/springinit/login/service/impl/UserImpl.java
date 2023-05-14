package com.example.springinit.login.service.impl;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springinit.login.dto.LoginDTO;
import com.example.springinit.login.dto.UserDTO;
import com.example.springinit.login.entity.User;
import com.example.springinit.login.repo.UserRepo;
import com.example.springinit.response.LoginResponse;

@Service
public class UserImpl implements UserService{

	@Autowired
    private UserRepo userRepo;
	
	@Autowired
    private PasswordEncoder passwordEncoder;
	
	@Override
	public String addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		 User user = new User(
				 userDTO.getEntryNo(),
				 userDTO.getName(),
				 userDTO.getContact(),
				 userDTO.getArea(),
				 userDTO.getCity(),
				 userDTO.getEmail(),
				 this.passwordEncoder.encode(userDTO.getPassword())
				 );
		 
		 	userRepo.save(user);
		 	
	        return user.getName();
	} 
	@Override
	public LoginResponse loginUser(LoginDTO loginDTO) {
		String msg="";
				User user1 = userRepo.findByEmail(loginDTO.getEmail());
				if (user1!=null) {
				String password = loginDTO.getPassword();
				String encodedPassword = user1.getPassword();
				Boolean isPwdRight = passwordEncoder.matches (password, encodedPassword);
				if (isPwdRight) {
				Optional<User>user =  userRepo.findOneByEmailAndPassword(loginDTO.getEmail(),encodedPassword);
				if (user.isPresent()) 
				{
				return new LoginResponse("Login Success",true);
				} 
				else 
				{
				return new LoginResponse("Login Failed",false);
				}
				} 
				else 
				{
				return new LoginResponse("password Not Match",false);
				}
				}
				else 
				{
				return new LoginResponse("Email not exits",false);
				}
	}
}
