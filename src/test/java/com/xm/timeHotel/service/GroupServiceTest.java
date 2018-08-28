package com.xm.timeHotel.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xm.timeHotel.pojo.Groups;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GroupServiceTest {
	
	@Autowired
	private GroupsService gs;
	
	@Test
	public void insert() {
		List<Groups> list = gs.selectIncludeFriendsByUid(1);
		System.out.println(list);
	}

}
