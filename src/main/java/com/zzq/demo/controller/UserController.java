package com.zzq.demo.controller;

import com.zzq.demo.model.User;
import com.zzq.demo.service.LikeLinkService;
import com.zzq.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private LikeLinkService likeLinkService;

	@RequestMapping("/map")
	public @ResponseBody
	Map<String,Object> map(){
		return userService.findProgrammerByUserId(1);
	}

	@RequestMapping("/listMap")
	public @ResponseBody
	List<Map<String,Object>> listMap(){
		return likeLinkService.findLikeLinkListByProgrammerId(1);
	}


	@RequestMapping("/listMapP")
	public @ResponseBody
	List<Map<String,Object>> listMapP(){
		return likeLinkService.findLikeLinkListByProgrammerIdAndName(1,"test");
	}

	@RequestMapping(value = "/test")
	public ModelAndView test(@ModelAttribute User user){
		System.out.println(user.getUserId());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message","测试");
		modelAndView.setViewName("test");
		return modelAndView;
	}
}
