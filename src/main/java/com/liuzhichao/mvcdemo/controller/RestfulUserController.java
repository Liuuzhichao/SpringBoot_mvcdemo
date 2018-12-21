package com.liuzhichao.mvcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liuzhichao.mvcdemo.entity.User;
import com.liuzhichao.mvcdemo.service.UserService;

@Controller
public class RestfulUserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showRestfulIndex")
	public String showRestfulIndex() {
		return "index";
	}
	
	@PostMapping("/restful_addUser")
	//返回的结果是JSON格式,直接写入http的ResponseBody中
	@ResponseBody
	//留疑:@requestBody注解
	/**
	 * @RequestBody处理ContentType是application/json格式的内容,
	 * 将请求体中的JSON字符串绑定到相应的Javabean上
	 */
	public String restful_addUser(@RequestBody User user) {
		userService.addUser(user);
		//返回JSON字符串形式,与ajax中的dataType对应
		return "{\"result\":\"controller_success\"}";
	}
	
	/**
	 * @PathVariable绑定ajax传过来的值到方法的参数上
	 * 用于将请求URL的模板变量映射到功能处理方法的参数上,即取出URI模板中的变量作为参数
	 */
}
