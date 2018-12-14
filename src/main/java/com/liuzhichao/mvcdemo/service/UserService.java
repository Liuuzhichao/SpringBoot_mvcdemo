package com.liuzhichao.mvcdemo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuzhichao.mvcdemo.entity.Car;
import com.liuzhichao.mvcdemo.entity.User;
import com.liuzhichao.mvcdemo.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> listAll() {
		return userMapper.selectAll();
	}
	
	public void addUser(User user) {
		userMapper.addUser(user);
	}
	
	public void updateUser(User user) {
		userMapper.updateUser(user);
	}
	
	public void deleteUser(Integer id) {
		userMapper.deleteUser(id);
	}
	
	public Car selectCarWithPerson(Integer id) {
		return userMapper.selectCarWithPerson(id);
	}
	
	public List<User> selectUsersByDeptId(Integer id) {
		return userMapper.selectUsersByDeptId(id);
	}
	
}
