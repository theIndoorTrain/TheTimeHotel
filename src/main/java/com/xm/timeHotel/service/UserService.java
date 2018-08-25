package com.xm.timeHotel.service;

import com.xm.timeHotel.pojo.User;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户 服务类
 * </p>
 *
 * @author xm
 * @since 2018-08-25
 */
public interface UserService extends IService<User> {

	List<User> list();

}
