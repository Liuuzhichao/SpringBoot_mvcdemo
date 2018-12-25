package com.liuzhichao.mvcdemo.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.liuzhichao.mvcdemo.entity.Car;
import com.liuzhichao.mvcdemo.entity.User;

//标识此类是Mapper类,交给Spring容器管理
//@Mapper
public interface UserMapper {
	
	@Select("select u.id, u.name, u.birthday, u.address from lzc_user u")
	List<User> selectAll();
	
	public void addUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(Integer id);
	
	public Car selectCarWithPerson(Integer id);
	
	public List<User> selectUsersByDeptId(Integer id);
	
	public User selectUserByUserId(Integer id);
	
}
