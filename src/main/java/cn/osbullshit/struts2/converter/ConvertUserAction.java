/** 
 * Project Name:struts2 
 * File Name:ConvertUserAction.java 
 * Package Name:cn.osbullshit.struts2.converter 
 * Date:2017年11月20日下午2:52:36 
 * 
 */  
  
package cn.osbullshit.struts2.converter;  

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:ConvertUserAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月20日 下午2:52:36 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ConvertUserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserBean user;

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	@Override
	public String execute() throws Exception {
		UserService service = new UserService();
		service.regist(user);
		return super.execute();
	}
	
	private List<UserBean> userList ;
	
	public List<UserBean> getUserList() {
		return userList;
	}

	public void setUserList(List<UserBean> userList) {
		this.userList = userList;
	}

	public String listUsers() throws Exception {
		UserService service = new UserService();
		setUserList(service.getList());
		return SUCCESS;
	}
	
}
 