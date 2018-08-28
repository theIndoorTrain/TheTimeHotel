package com.xm.timeHotel.service;

import com.xm.timeHotel.pojo.Groups;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 好友分组 服务类
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
public interface GroupsService extends IService<Groups> {
	
	/**
	 * 添加分组
	 * @param uid
	 * @param gname
	 */
	void insert(Integer uid, String gname);
	
	List<Groups> selectIncludeFriendsByUid(Integer uid);

}
