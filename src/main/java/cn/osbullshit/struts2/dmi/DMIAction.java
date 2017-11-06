/** 
 * Project Name:struts2 
 * File Name:DMIAction.java 
 * Package Name:cn.osbullshit.struts2.dmi 
 * Date:2017年11月6日下午3:28:06 
 * 
 */  
  
package cn.osbullshit.struts2.dmi;  


import javax.servlet.http.Cookie;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

import cn.osbullshit.struts2.user.domain.User;
import cn.osbullshit.struts2.user.service.UserService;

/** 
 * ClassName:DMIAction  动态结果调用
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月6日 下午3:28:06 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class DMIAction {

	private User user ;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String login() {
		UserService service = new UserService();
		
		int i = service.volidateLogin(user);
		
		ActionContext acxtcx = ActionContext.getContext();
		
		acxtcx.getContextMap().put("userId", "6666");
		
		acxtcx.getApplication().put("userName", "zhangbaoqi");
		
		Cookie cookie = new Cookie("userAge","16");
		
		ServletActionContext.getResponse().addCookie(cookie);
		
		if(i > 0) {
			return Action.SUCCESS;
		}
		return Action.ERROR;
	}

	public String regist() {
		
		UserService service = new UserService();
		
		service.registUser(getUser());
		
		ActionContext acxtcx = ActionContext.getContext();
		acxtcx.getContextMap().put("userId", 666665);
		
		acxtcx.getApplication().put("userName", "guyu");
		
		Cookie cookie = new Cookie("userAge","15");
		
		ServletActionContext.getResponse().addCookie(cookie);
		
		return Action.SUCCESS;
	}
}
 