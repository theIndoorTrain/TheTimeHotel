package com.xm.timeHotel.service.impl;

import com.xm.timeHotel.pojo.Friend;
import com.xm.timeHotel.mapper.FriendMapper;
import com.xm.timeHotel.service.FriendService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.mapstruct.ap.shaded.freemarker.core.FMParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 好友 服务实现类
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
@Service
public class FriendServiceImpl extends ServiceImpl<FriendMapper, Friend> implements FriendService {
	
	@Autowired
	private FriendMapper friendMapper;

	@Override
	public Friend selectUser(Integer id, String email) {
		return friendMapper.selectUser(id,email);
	}

	@Override
	public List<Friend> getAddFriendList(Integer myid) {
		return friendMapper.getAddFriendList(myid) ;
	}

}
