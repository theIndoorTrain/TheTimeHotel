package com.xm.timeHotel.service.impl;

import com.xm.timeHotel.pojo.User;
import com.xm.timeHotel.mapper.UserMapper;
import com.xm.timeHotel.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author xm
 * @since 2018-08-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> list() {
		return userMapper.list();
	}

}
