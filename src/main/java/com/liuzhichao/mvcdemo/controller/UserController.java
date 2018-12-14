package com.liuzhichao.mvcdemo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liuzhichao.mvcdemo.entity.Car;
import com.liuzhichao.mvcdemo.entity.User;
import com.liuzhichao.mvcdemo.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//以get方式请求,是RequestMapping的子属性,访问路径user/list/all
	@GetMapping("/list/all")
	//日期格式显示的毫秒值,需要进行转换
	public List<User> listAll() {
		return userService.listAll();
	}
	
	//添加用户
	@GetMapping("/add")
	public String addUser() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//数据库中是date格式,类中用util包中的Date类
		Date date;
		try {
			date = (Date) sdf.parse("1990-1-1");
			User user = new User(4,"田六",date,"广州");
			userService.addUser(user);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "add user success!";
	}
	
	@GetMapping("/update")
	public String updateUser() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = sdf.parse("1999-1-1");
			User user = new User(1,"修改1",date,"北京1");
			userService.updateUser(user);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "update user success!";
	}
	
	@GetMapping("/delete")
	public String deleteUser(Integer id) {
		/**
		 * 从实体类到控制器,都要用包装类型,中途传递的参数类型也要用包装类
		 * 否则无法访问,因为简单类型没有null值
		 */
		userService.deleteUser(4);
		return "delete user success!";
	}
	
	@GetMapping("/selectCarWithPerson")
	public Car selectCarWithPerson(Integer id) {
		id = 1;
		return userService.selectCarWithPerson(id);
	}
	
	@GetMapping("selectUsersByDeptId")
	public List<User> selectUsersByDeptId(Integer id) {
		id = 1001;
		return userService.selectUsersByDeptId(id);
	}
	
}
