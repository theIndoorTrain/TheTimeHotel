package com.xm.timeHotel.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xm.timeHotel.pojo.User;
import com.xm.timeHotel.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author xm
 * @since 2018-08-25
 */
@Api(value="UserController",tags="用户 登录、登出、注册")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value="查询用户列表",notes="用户列表")
	@GetMapping("/list")
	public List<User> list() {
		return userService.list();
	}

}

