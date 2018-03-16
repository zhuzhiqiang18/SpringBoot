package com.zzq.demo.service;

import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface LikeLinkService {


	List<Map<String,Object>> findLikeLinkListByProgrammerId(Integer programmerId);

	List<Map<String,Object>> findLikeLinkListByProgrammerIdAndName(Integer programmerId,String name);

	Page<List<Map<String,Object>>> findLikeLinkListByProgrammerIdAndNamePage(Integer programmerId, String name,int pageNum,int pageSize);
}
