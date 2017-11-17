/** 
 * Project Name:struts2 
 * File Name:Token.java 
 * Package Name:cn.osbullshit.struts2.token 
 * Date:2017年11月17日下午4:39:21 
 * 
 */  
  
package cn.osbullshit.struts2.token;  

import cn.osbullshit.struts2.user.domain.User;
import cn.osbullshit.struts2.user.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:Token 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月17日 下午4:39:21 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Token extends ActionSupport{

	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	public String execute() throws Exception {
		UserService service = new UserService();
		service.registUser(user);
		return super.execute();
	}
	
	

}
 