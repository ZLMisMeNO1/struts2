/** 
 * Project Name:struts2 
 * File Name:ValidateUserName.java 
 * Package Name:cn.osbullshit.struts2.ajax 
 * Date:2017年11月21日上午11:09:48 
 * 
 */  
  
package cn.osbullshit.struts2.ajax;  

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:ValidateUserName 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午11:09:48 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ValidateUserName extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String tip;
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	private UserBean userBean;
	
	
	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

	
	public InputStream getValidateName() throws Exception {
		
		return new ByteArrayInputStream(tip.getBytes("utf-8"));
	}

	@Override
	public String execute() {
		UserService service = new UserService();
		if(service.findByUser(userName)) {
			tip = "<span style='color:red;'> 用户名已存在 </span>"; 
		} else {
			tip = "<span style='color:green;'> 用户名合法 </span>";
		}
		userBean.setName("admin");
		userBean.setPass("admin");
		return SUCCESS;
	}
}
 