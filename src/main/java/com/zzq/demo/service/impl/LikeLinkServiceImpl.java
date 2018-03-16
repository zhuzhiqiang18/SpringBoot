package com.zzq.demo.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzq.demo.mapper.LikeLinkMapper;
import com.zzq.demo.service.LikeLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

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

	@Override
	public Page<List<Map<String, Object>>> findLikeLinkListByProgrammerIdAndNamePage(Integer programmerId, String name,int pageNum,int pageSize) {
		Assert.notNull(programmerId, "Name must not be null");
		Assert.notNull(name, "Name must not be null");
		Assert.notNull(pageNum, "Name must not be null");
		Assert.notNull(pageSize, "Name must not be null");
		PageHelper.startPage(pageNum,pageSize);//分页
		return likeLinkMapper.findLikeLinkListByProgrammerIdAndNamePage(programmerId,name);
	}
}
