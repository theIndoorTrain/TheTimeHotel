package com.xm.timeHotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xm.timeHotel.controller.dto.UserDtoMapper;
import com.xm.timeHotel.controller.dto.UserDto;
import com.xm.timeHotel.pojo.User;

@RestController("/user")
public class UserController {
	
	@Autowired
	private UserDtoMapper userDtoMapper;
	
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
	
	@PostMapping("/userDto")
	public void getUser(UserDto userDto) {
		User user = userDtoMapper.dtoToUser(userDto);
		System.out.println(user);
	}
	
	@PostMapping("/user")
	public void getUserDto(User user) {
		UserDto userDto = userDtoMapper.userToDto(user);
		System.out.println(user);
	}

}
