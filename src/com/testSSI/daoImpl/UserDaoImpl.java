package com.testSSI.daoImpl;

import org.mybatis.spring.support.SqlSessionDaoSupport;    
import org.springframework.stereotype.Repository;    
    
import com.testSSI.dao.UserDao;    
import com.testSSI.model.User;    
    
@Repository(value = "userDao")    
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {    

	@Override
	public User getUserByName(String name) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("UserMapper.getUserByName", name);// select语句，传入一个参数，返回User对象 
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int UserId) {
		// TODO Auto-generated method stub
		
	}    
    
}   