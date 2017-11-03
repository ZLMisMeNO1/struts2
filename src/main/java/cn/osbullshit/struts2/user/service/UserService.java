/** 
 * Project Name:struts2 
 * File Name:UserService.java 
 * Package Name:cn.osbullshit.struts2.service 
 * Date:2017年10月31日上午9:00:45 
 * 
 */  
  
package cn.osbullshit.struts2.user.service;  

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import cn.osbullshit.struts2.user.domain.User;

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
		userdb.add(new User(2,"zhang","456",new Date(),343.4d));
	}

	public Integer volidateLogin(User user) {
		for(User u : userdb) {
			if(u.equals(user)) {
				return u.getId();
			}
		}
		return -1;
	}

	public void registUser(User user) {
		user.setId(new Random().nextInt(99999));
		userdb.add(user);
	}

	public List<User> getAllUsers() {
		return userdb;
	}
}
 