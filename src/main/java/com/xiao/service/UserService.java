package com.xiao.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiao.dao.UserDao;
import com.xiao.domain.User;
import com.xiao.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private UserMapper userMapper;
	
	public boolean hasMatchUser(String username,String password){
		int matchCount;
		matchCount = userDao.getMatchUserCount(username, password);
		return matchCount > 0;
	}
	
	public void succLogon(String username,String ip){
		User user = userDao.findUserByName(username);
		user.setPoint(user.getPoint() + 5);
		user.setLastIP(ip);
		user.setLastVisit(new Date());
		userDao.updateUser(user);
		
		User user2 = userMapper.findById(user.getUserID());
		System.out.println("userName :" + user2.getUserName());
		
	}
}
