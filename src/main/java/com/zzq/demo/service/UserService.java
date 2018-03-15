package com.zzq.demo.service;

import com.zzq.demo.model.User;

import java.util.Map;

public interface UserService {
	void insert(User user);

	Map<String,Object> findProgrammerByUserId(Integer userId);
}
