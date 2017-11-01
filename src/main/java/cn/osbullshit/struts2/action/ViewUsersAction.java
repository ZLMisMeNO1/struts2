/** 
 * Project Name:struts2 
 * File Name:ViewUserActions.java 
 * Package Name:cn.osbullshit.struts2.action 
 * Date:2017年11月1日上午11:26:00 
 * 
 */  
  
package cn.osbullshit.struts2.action;  

import java.util.List;

import cn.osbullshit.struts2.domain.User;
import cn.osbullshit.struts2.service.UserService;

import com.opensymphony.xwork2.Action;

/** 
 * ClassName:ViewUserActions 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月1日 上午11:26:00 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ViewUsersAction implements Action{

	private List<User> users ;
	
	
	public List<User> getUsers() {
		return users;
	}



	public void setUsers(List<User> users) {
		this.users = users;
	}



	@Override
	public String execute() throws Exception {
		UserService service = new UserService ();
		setUsers(service.getAllUsers());
		return SUCCESS;
	}

}
 