/**  

* Title: Demo.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月28日  

* @version 1.0  

*/
package cn.itcast.a_jdbctemplate;

import java.beans.PropertyVetoException;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import cn.itcast.bean.User;

//演示jdbc模板
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo {
    @Resource
    private UserDao userDao;
    
	@Test
    public void fun1() throws PropertyVetoException{
		//0准备连接池
		ComboPooledDataSource dataSource=new ComboPooledDataSource();
    	
    	dataSource.setDriverClass("com.mysql.jdbc.Driver");
    	dataSource.setJdbcUrl("jdbc:mysql:///hibernate_32");
    	dataSource.setUser("root");
    	dataSource.setPassword("root");
    	//1创建jdbc模板对象
    	JdbcTemplate jt=new JdbcTemplate();
    	jt.setDataSource(dataSource);
    	
    	//2书写sql,并执行
    	String sql="insert into t_user values(null,'rose')";
    	jt.update(sql);
    }
	@Test
	 public void fun2() throws PropertyVetoException{
	    User u=new User();
	    u.setName("tom");
	    userDao.save(u);
    }
}
