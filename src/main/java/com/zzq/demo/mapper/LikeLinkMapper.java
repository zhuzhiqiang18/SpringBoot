package com.zzq.demo.mapper;

import com.github.pagehelper.Page;
import com.zzq.demo.model.LikeLink;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LikeLinkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LikeLink record);

    int insertSelective(LikeLink record);

    LikeLink selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LikeLink record);

    int updateByPrimaryKey(LikeLink record);

    List<Map<String,Object>> findLikeLinkListByProgrammerId(Integer programmerId);

	List<Map<String,Object>> findLikeLinkListByProgrammerIdAndName(@Param("programmerId") Integer programmerId,@Param("name") String name);

    Page<List<Map<String,Object>>> findLikeLinkListByProgrammerIdAndNamePage(@Param("programmerId") Integer programmerId, @Param("name") String name);
}