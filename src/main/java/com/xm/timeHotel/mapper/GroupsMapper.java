package com.xm.timeHotel.mapper;

import com.xm.timeHotel.pojo.Groups;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
 * 好友分组 Mapper 接口
 * </p>
 *
 * @author xm
 * @since 2018-08-28
 */
public interface GroupsMapper extends BaseMapper<Groups> {

	List<Groups> selectIncludeFriendsByUid(Integer uid);

}
