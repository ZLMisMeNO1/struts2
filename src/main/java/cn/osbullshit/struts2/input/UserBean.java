/** 
 * Project Name:struts2 
 * File Name:UserBean.java 
 * Package Name:cn.osbullshit.struts2.converter 
 * Date:2017年11月20日下午2:53:37 
 * 
 */  
  
package cn.osbullshit.struts2.input;  

import java.util.Date;

/** 
 * ClassName:UserBean 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月20日 下午2:53:37 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UserBean {

	private Integer id;
	
	private String name;
	
	private String pass;
	
	private int height;
	
	private double weight;
	
	private Date birth;

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
 