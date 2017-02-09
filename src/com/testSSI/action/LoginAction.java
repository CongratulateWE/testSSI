package com.testSSI.action;

import javassist.bytecode.stackmap.TypeData.ClassName;

import org.springframework.beans.factory.annotation.Autowired;
import org.apache.log4j.Logger;

import com.testSSI.dao.UserDao;
import com.testSSI.model.User;

public class LoginAction extends BaseAction {
	@Autowired
	private UserDao userDao;    
    private User user;
    public String name;    
    public String pwd;
    
    private static Logger logger = Logger.getLogger("sunfiyes");
	@Override
	public String execute() throws Exception {
		logger.info(name+"---"+pwd);
		user = userDao.getUserByName(name);    
        if (user != null) {    
            if (user.getPwd().equals(pwd)) {    
                return SUCCESS;    
            }    
        }    
        return ERROR; 
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
