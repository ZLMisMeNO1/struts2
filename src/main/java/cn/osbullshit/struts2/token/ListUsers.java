/** 
 * Project Name:struts2 
 * File Name:ListUsers.java 
 * Package Name:cn.osbullshit.struts2.token 
 * Date:2017年11月17日下午4:41:34 
 * 
 */  
  
package cn.osbullshit.struts2.token;  

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.osbullshit.struts2.user.domain.User;
import cn.osbullshit.struts2.user.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:ListUsers 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月17日 下午4:41:34 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ListUsers extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private  List<User> userdb;
	

	public  List<User> getUserdb() {
		return userdb;
	}


	public  void setUserdb(List<User> userdb) {
		this.userdb = userdb;
	}


	@Override
	public String execute() throws Exception {
		UserService service = new UserService();
		setUserdb(service.getAllUsers());
		return SUCCESS;
	}
	
	

}
 