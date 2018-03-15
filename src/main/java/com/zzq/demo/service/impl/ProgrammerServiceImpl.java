package com.zzq.demo.service.impl;

import com.zzq.demo.mapper.ProgrammerMapper;
import com.zzq.demo.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ProgrammerServiceImpl implements ProgrammerService{
	@Autowired
	ProgrammerMapper programmerMapper;

}
