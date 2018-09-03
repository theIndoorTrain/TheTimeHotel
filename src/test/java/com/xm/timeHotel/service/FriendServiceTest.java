package com.xm.timeHotel.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xm.timeHotel.pojo.Friend;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendServiceTest {
	
	@Autowired
	private FriendService fs;
	
	@Test
	public void insert() {
		System.out.println(fs.getAddFriendList(2));
	}

}
