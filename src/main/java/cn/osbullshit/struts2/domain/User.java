/** 
 * Project Name:struts2 
 * File Name:User.java 
 * Package Name:cn.osbullshit.struts2.domain 
 * Date:2017年10月31日上午8:58:36 
 * 
 */  
  
package cn.osbullshit.struts2.domain;  

import java.util.Date;

/** 
 * ClassName:User 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年10月31日 上午8:58:36 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class User {

	private Integer id;
	
	private String name;
	
	private String pass;
	
	private Date birth;
	
	private Double weight = 0.0d;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}

	public User() {
		super();
	}

	public User(Integer id, String name, String pass, Date birth, Double weight) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.birth = birth;
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

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
	
}
 