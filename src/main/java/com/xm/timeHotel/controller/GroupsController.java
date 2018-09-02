package com.xm.timeHotel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.xm.timeHotel.pojo.Groups;
import com.xm.timeHotel.service.GroupsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 好友分组 前端控制器
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
@Api(value="GroupsController",tags="好友分组管理")
@RestController
@RequestMapping("/groups")
public class GroupsController {
	
	@Autowired
	private GroupsService groupsService;
	
	@ApiOperation(value="根据用户id查询用户的好友分组列表详细信息")
	@ApiImplicitParam(value="uid",name="用户id")
	@GetMapping("/{uid}")
	public List<Groups> list(@PathVariable Integer uid) {
		return groupsService.selectIncludeFriendsByUid(uid);		
	}
	
	@ApiOperation(value="根据用户id查询用户的好友分组列表信息")
	@ApiImplicitParam(value="uid",name="用户id")
	@GetMapping("/list/{uid}")
	public List<Groups> lists(@PathVariable Integer uid) {
		return groupsService.selectList(new EntityWrapper<Groups>().eq("uid", uid));
	}

}

