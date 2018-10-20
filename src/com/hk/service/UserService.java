package com.hk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.dao.UserDao;
import com.hk.po.User;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	//通过账号和密码查询用户
    public User findUser(String usercode,String password) {
    	User user=this.userDao.findUser(usercode, password);
    	return user;
    }
}
