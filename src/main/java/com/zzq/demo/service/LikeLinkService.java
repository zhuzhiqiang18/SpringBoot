package com.zzq.demo.service;

import java.util.List;
import java.util.Map;

public interface LikeLinkService {


	List<Map<String,Object>> findLikeLinkListByProgrammerId(Integer programmerId);

	List<Map<String,Object>> findLikeLinkListByProgrammerIdAndName(Integer programmerId,String name);
}
