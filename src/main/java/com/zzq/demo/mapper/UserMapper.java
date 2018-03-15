package com.zzq.demo.mapper;

import com.zzq.demo.model.User;

import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	Map<String,Object> findProgrammerByUserId(Integer id);
}