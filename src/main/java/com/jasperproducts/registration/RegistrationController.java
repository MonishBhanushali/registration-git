package com.jasperproducts.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jasperproducts.registration.model.User;
import com.jasperproducts.registration.model.UserRepo;


@RestController
public class RegistrationController {

	@Autowired
	private UserRepo userrepo;
	
	@RequestMapping("/check")
	public String check() {
		return "chck the register ";
		
	} 
	
	@RequestMapping("/register-user/{username}/{password}")
	public String registeruser(@PathVariable ("username") String username, @PathVariable ("password") String password) {
		User u = new  User();
		u.setName(username);
		u.setPasswd(password);
		userrepo.save(u);
		return "register";
	} 
}
