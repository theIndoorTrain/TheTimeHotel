package com.xm.timeHotel.service.impl;

import com.xm.timeHotel.pojo.Groups;
import com.xm.timeHotel.mapper.GroupsMapper;
import com.xm.timeHotel.service.GroupsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 好友分组 服务实现类
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
@Service
public class GroupsServiceImpl extends ServiceImpl<GroupsMapper, Groups> implements GroupsService {
	
	@Autowired
	private GroupsMapper groupMapper;

	@Override
	public void insert(Integer uid, String gname) {
		Groups group = new Groups();
		group.setUid(uid);
		group.setGname(gname);
		groupMapper.insert(group);
		
	}

	@Override
	public List<Groups> selectIncludeFriendsByUid(Integer uid) {
		return groupMapper.selectIncludeFriendsByUid(uid);
	}

}
