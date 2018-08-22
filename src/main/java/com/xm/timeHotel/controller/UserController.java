package com.xm.timeHotel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xm.timeHotel.pojo.User;

@RestController("/user")
public class UserController {
	
	@PostMapping("/login")
	public Boolean doLogin(@RequestBody User user) {
			if(user.getUsername().equals("admin")&&user.getPassword().equals("123456")) {
				return true;
			}
			return false;
	}
	
	@GetMapping("/icon/{username}") 
	public String getIconUrl(@PathVariable String username) {
		System.out.println("读取头像地址");
		return "http://127.0.0.1:8088/1.jpg";
	}
	
	@GetMapping("/logout") 
	public void logout() {
		System.out.println("用户退出");
	}

}
