package com.xiao.dao;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.xiao.domain.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int getMatchUserCount(String username,String password){
		String sql = "SELECT count(*) FROM t_user " + 
					 "WHERE username = ? and password = ?";
		int result = jdbcTemplate.queryForInt(sql,new Object[]{username,password});
		return result;
	}
	
	public User findUserByName(String username){
		User user = new User();
		String sql = "SELECT * "
				+ "FROM t_user WHERE userName = ? ";
		List rows = jdbcTemplate.queryForList(sql,new Object[]{username});
		Map map = (Map) rows.get(0);
		user.setUserID((Integer)map.get("userID"));
		user.setUserName((String)map.get("userName"));
		user.setPassWord((String)map.get("passWord"));
		user.setPoint((Integer)map.get("point"));
		user.setLastIP((String)map.get("lastIP"));
		user.setLastVisit((Date)map.get("lastVisit"));
		return user;
	}
	
	public int updateUser(User user){
		String sql = "UPDATE t_user SET point = ? ,lastIP = ? ,lastVisit = ? "
				+ "WHERE userID = ? ";
		int result = jdbcTemplate.update(sql,new Object[]{user.getPoint(),user.getLastIP(),user.getLastVisit(),user.getUserID()});
		return result;
	}
}
