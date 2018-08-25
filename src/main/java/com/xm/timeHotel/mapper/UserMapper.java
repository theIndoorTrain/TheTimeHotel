package com.xm.timeHotel.mapper;

import com.xm.timeHotel.pojo.User;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 用户 Mapper 接口
 * </p>
 *
 * @author xm
 * @since 2018-08-25
 */
public interface UserMapper extends BaseMapper<User> {

	List<User> list();

}
