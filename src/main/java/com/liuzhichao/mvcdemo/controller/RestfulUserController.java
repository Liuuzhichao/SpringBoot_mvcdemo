package com.liuzhichao.mvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	 * @PathVariable绑定ajax传过来的值到方法的参数上,url上面的值
	 * 用于将请求URL的模板变量映射到功能处理方法的参数上,即取出URI模板中的变量作为参数
	 */
	//@RequestMapping(value="/restful_delete/{id}", method=RequestMethod.DELETE)
	@ResponseBody
	@DeleteMapping("/restful_delete/{id}")//与上面注释掉到RequestMapping相同作用
	public String restful_deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
		return "{\"result\":\"deleteSuccess\"}";
	}
	
	//测试,delete类型传递错误,post可行
	/*@ResponseBody
	//@RequestMapping(value="/restful_delete1", method=RequestMethod.DELETE)
	@DeleteMapping("/restful_delete1")
	public String restful_delete1(@RequestParam("id") Integer id) {
		//System.out.println("del.....");
		userService.deleteUser(id);
		System.out.println("del....end...."+id);
		return "{\"result\":\"deleteSuccess\"}";
	}*/
	
	@ResponseBody
	@GetMapping("/selectAll")
	public List<User> selectAll() {
		return userService.listAll();
	}
	
	@ResponseBody
	@GetMapping("/selectById/{id}")
	public User selectById(@PathVariable("id") Integer id) {
		return userService.selectUserByUserId(id);
	}
	
	@ResponseBody
	@PutMapping("/restful_update")
	public String UpdateUser(@RequestBody User user) {
		userService.updateUser(user);
		return "{\"result\":\"updateSuccess\"}";
	}
	
}
