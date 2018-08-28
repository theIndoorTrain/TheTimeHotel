package com.xm.timeHotel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.xm.timeHotel.controller.dto.UserDto;
import com.xm.timeHotel.controller.dto.UserDtoMapper;
import com.xm.timeHotel.pojo.User;
import com.xm.timeHotel.service.GroupsService;
import com.xm.timeHotel.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xm
 * @since 2018-08-27
 */
@Api(value="UserController",tags="用户管理")
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDtoMapper userDtoMapper;
	@Autowired
	private UserService userService;
	@Autowired
	private GroupsService groupService;
	
	
	@ApiOperation(value="用户注册")
	@ApiImplicitParam(value="UserDto",name="用户Dto")
	@PostMapping("/sighIn")
	public UserDto sighIn(@RequestBody UserDto userDto) {
		User user = userDtoMapper.dtoToUser(userDto);
		if(userService.insert(user)) {
			user = userService.selectOne(new EntityWrapper<User>().eq("email", user.getEmail()));
			groupService.insert(user.getId(),"好友");
			return userDtoMapper.userToDto(user);
		}
		return null;
	}
	
	@ApiOperation(value="用户登录")
	@ApiImplicitParam(value="UserDto",name="用户Dto")
	@PostMapping("/login")
	public UserDto login(@RequestBody UserDto userDto) {
		User user = userDtoMapper.dtoToUser(userDto);
		List<User> users =  userService.selectList(new EntityWrapper<User>().eq("email", user.getEmail()).eq("password", user.getPassword()));
		if(users != null && users.size()>0) {
			user = users.get(0);
			return userDtoMapper.userToDto(user);
		}
		return null;
	}
	
	@ApiOperation(value="用户退出")
	@GetMapping("/logout")
	public void logout() {
		System.out.println("用户退出");
	}
	
	@ApiOperation(value="根据用户id查询用户")
	@GetMapping("/{id}")
	public UserDto getById(@PathVariable Integer id) {
		
		return userDtoMapper.userToDto(userService.selectById(id));
		
	}

}

