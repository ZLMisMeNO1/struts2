/** 
 * Project Name:struts2 
 * File Name:LoginPro.java 
 * Package Name:cn.osbullshit.struts2.action 
 * Date:2017年10月31日上午8:57:46 
 * 
 */  
  
package cn.osbullshit.struts2.user.action;  

import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import cn.osbullshit.struts2.user.domain.User;
import cn.osbullshit.struts2.user.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/** 
 * ClassName:LoginPro 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年10月31日 上午8:57:46 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class LoginProAction  implements Action{

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
		
		//访问 servletAPI 两种方式  
		//1.伪访问
		ActionContext actCtx = ActionContext.getContext();
		Map<String,Object> map = actCtx.getSession();
		Map<String,Object> application  = actCtx.getApplication();
		map.put("userId", "12312312");
		application.put("userName", "zhangbaoqi");
		
		//2.真访问,会造成代码污染，但有时迫不得已，比如数据加入cookie
		HttpServletResponse response = ServletActionContext.getResponse();
		Cookie cookie = new Cookie("userAge","gudaya");
		cookie.setMaxAge(200000);
		response.addCookie(cookie);
		if(id > 0 ) {
		
			return SUCCESS;
		}
		return ERROR;
	}

	public String regist () {
		UserService service = new UserService();
		service.registUser(user);
		return SUCCESS;
	}
}
 