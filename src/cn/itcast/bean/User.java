/**  

* Title: User.java  

* Description:  

* Copyright: Copyright (c) 2017 

* Company: www.baidudu.com 

* @author 172219902  

* @date 2018年3月28日  

* @version 1.0  

*/
package cn.itcast.bean;


public class User {
    private Integer id;
    private String name;
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)  
	
	 * Title: toString 
	
	 * Description:   
	
	 * @return  
	
	 * @see java.lang.Object#toString()  
	
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
    
}
