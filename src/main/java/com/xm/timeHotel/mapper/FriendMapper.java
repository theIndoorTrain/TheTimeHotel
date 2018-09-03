package com.xm.timeHotel.mapper;

import com.xm.timeHotel.pojo.Friend;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 好友 Mapper 接口
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
public interface FriendMapper extends BaseMapper<Friend> {

	Friend selectUser(@Param("id")Integer id, @Param("email")String email);

	List<Friend> getAddFriendList(Integer myid);

}
