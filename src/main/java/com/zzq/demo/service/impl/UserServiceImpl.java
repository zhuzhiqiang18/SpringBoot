package com.zzq.demo.service.impl;

import com.zzq.demo.mapper.UserMapper;
import com.zzq.demo.model.User;
import com.zzq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;
	public void insert(User user){
		userMapper.insert(user);
	}

	@Override
	public Map<String, Object> findProgrammerByUserId(Integer userId) {
		return userMapper.findProgrammerByUserId(userId);
	}
}
