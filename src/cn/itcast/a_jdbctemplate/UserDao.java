/**  

* Title: UserDao.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月28日  

* @version 1.0  

*/
package cn.itcast.a_jdbctemplate;

import java.util.List;

import cn.itcast.bean.User;

public interface UserDao {
    //增
	void save(User user);
	//删
	void delete(Integer id);
	//改
	void update(User user);
	//查
	User getById(Integer id);
	//查
	int getTotalCount();
	//查
	List<User> getAll();
}
