package com.xm.timeHotel.service;

import com.xm.timeHotel.pojo.Friend;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 好友 服务类
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
public interface FriendService extends IService<Friend> {

	Friend selectUser(Integer id, String email);

	List<Friend> getAddFriendList(Integer myid);

}
