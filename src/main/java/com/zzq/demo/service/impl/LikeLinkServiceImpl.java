package com.zzq.demo.service.impl;

import com.zzq.demo.mapper.LikeLinkMapper;
import com.zzq.demo.service.LikeLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class LikeLinkServiceImpl implements LikeLinkService{
	@Autowired
	LikeLinkMapper likeLinkMapper;

	public List<Map<String,Object>> findLikeLinkListByProgrammerId(Integer programmerId){
		return likeLinkMapper.findLikeLinkListByProgrammerId(programmerId);
	}

	@Override
	public List<Map<String, Object>> findLikeLinkListByProgrammerIdAndName(Integer programmerId, String name) {
		return likeLinkMapper.findLikeLinkListByProgrammerIdAndName(programmerId,name);
	}
}
