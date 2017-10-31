/** 
 * Project Name:struts2 
 * File Name:LoginPro.java 
 * Package Name:cn.osbullshit.struts2.action 
 * Date:2017年10月31日上午8:57:46 
 * 
 */  
  
package cn.osbullshit.struts2.action;  

import cn.osbullshit.struts2.domain.User;
import cn.osbullshit.struts2.service.UserService;

import com.opensymphony.xwork2.Action;

/** 
 * ClassName:LoginPro 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年10月31日 上午8:57:46 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class LoginProAction implements Action{

	private User user;
	
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	@Override
	public String execute() throws Exception {
		UserService service = new UserService();
		Integer id = service.volidateLogin(user);
		if(id > 0 ) {
			return SUCCESS;
		}
		return ERROR;
	}

}
 