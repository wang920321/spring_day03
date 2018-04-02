/**  

* Title: UserDaoImpl.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月28日  

* @version 1.0  

*/
package cn.itcast.a_jdbctemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import cn.itcast.bean.User;

/**  

* Title: UserDaoImpl  

* Description:   

* @author 172219902  

* @date 2018年3月28日  

*/
public class UserDaoImpl implements UserDao {
    
    private JdbcTemplate jt;
	@Override
	public void save(User user) {
		String sql="insert into t_user values(null,?)";
        jt.update(sql, user.getName());
	}

	
	@Override
	public void delete(Integer id) {
		String sql="delete from t_user where id=?";
        jt.update(sql, id);

	}


	@Override
	public void update(User user) {
		String sql="update t_user set name= ? where id=?";
        jt.update(sql, user.getName(),user.getId());

	}

	
	@Override
	public User getById(Integer id) {
		String sql="select * from t_user where id=? ";
        return jt.queryForObject(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				return user;
			}}, id);
       
	}

	
	@Override
	public int getTotalCount() {
		String sql="select * from t_user where id=? ";
		Integer count = jt.queryForObject(sql, Integer.class);
		return count;
	}


	@Override
	public List<User> getAll() {
		String sql="select * from t_user ";
		List<User> list = jt.query(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				User user=new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				return user;
			}});
		return list;
	}


	/**
	 * @param jt the jt to set
	 */
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

}
