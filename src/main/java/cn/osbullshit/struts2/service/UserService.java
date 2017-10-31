/** 
 * Project Name:struts2 
 * File Name:UserService.java 
 * Package Name:cn.osbullshit.struts2.service 
 * Date:2017年10月31日上午9:00:45 
 * 
 */  
  
package cn.osbullshit.struts2.service;  

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.osbullshit.struts2.domain.User;

/** 
 * ClassName:UserService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年10月31日 上午9:00:45 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UserService {

	private static List<User> userdb;
	
	static {
		userdb = new ArrayList<User> ();
		userdb.add(new User(1,"admin","123",new Date(),23.4d));
	}

	public Integer volidateLogin(User user) {
		for(User u : userdb) {
			if(u.equals(user)) {
				return u.getId();
			}
		}
		return -1;
	}
}
 