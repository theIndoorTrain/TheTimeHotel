package com.xm.timeHotel.service.impl;

import com.xm.timeHotel.pojo.User;
import com.xm.timeHotel.mapper.UserMapper;
import com.xm.timeHotel.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xm
 * @since 2018-08-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
