package com.xm.timeHotel.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.xm.timeHotel.controller.dto.UserDto;
import com.xm.timeHotel.controller.dto.UserDtoMapper;
import com.xm.timeHotel.pojo.Friend;
import com.xm.timeHotel.pojo.User;
import com.xm.timeHotel.service.FriendService;
import com.xm.timeHotel.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 好友 前端控制器
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
@Api(value="FriendController",tags="好友管理")
@RestController
@RequestMapping("/friend")
public class FriendController {
	@Autowired
	private FriendService friendService;

	@ApiOperation(value="根据用户email查询用户")
	@PostMapping("/user")
	public Friend getByEmail(@RequestBody UserDto userDto) {
		return friendService.selectUser(userDto.getId(),userDto.getEmail());
	}
	
	@ApiOperation(value="根据好友id删除好友")
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		friendService.deleteById(id);
	}
	
	@ApiOperation(value="申请添加好友")
	@GetMapping("/add/{myid}/{uid}")
	public void add(@PathVariable Integer myid,@PathVariable Integer uid) {
		//如果申请添加过好友后，将不再添加
		if(friendService.selectOne(new EntityWrapper<Friend>().eq("uid", myid).eq("myid", uid))==null) 
		{
			Friend friend = new Friend();
			friend.setMyid(uid);
			friend.setUid(myid);
			friendService.insert(friend);
		}	
	}
	
	@ApiOperation(value="根据用户id查询好友申请列表")
	@GetMapping("/addList/{myid}")
	public List<Friend> getAddFriendList(@PathVariable Integer myid) {
		int id = myid;
		return friendService.getAddFriendList(myid);
	}
	
	@ApiOperation(value="修改好友信息")
	@PutMapping("/update")
	public void update(@RequestBody Friend friend) {
		friendService.updateById(friend);
	}
	
	@ApiOperation(value="同意好友申请")
	@PutMapping("/updateAdd")
	public void updateAddStatus(@RequestBody Friend friend) {
		friend.setStatus(true);
		friendService.updateById(friend);
		Friend f = new Friend();
		f.setUid(friend.getMyid());
		f.setMyid(friend.getUid());
		f.setStatus(true);
		friendService.insert(f);
	}
}

