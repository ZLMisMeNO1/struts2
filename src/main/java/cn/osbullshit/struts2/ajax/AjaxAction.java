/** 
 * Project Name:struts2 
 * File Name:AjaxAction.java 
 * Package Name:cn.osbullshit.struts2.ajax 
 * Date:2017年11月21日上午10:46:04 
 * 
 */  
  
package cn.osbullshit.struts2.ajax;  

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:AjaxAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午10:46:04 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class AjaxAction extends ActionSupport{

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

	
	private List<UserBean> ulist ;
	public List<UserBean> getUlist() {
		return ulist;
	}

	public void setUlist(List<UserBean> ulist) {
		this.ulist = ulist;
	}

	public String  getList() {
		UserService service = new UserService();
		setUlist(service.getList());
		return SUCCESS;
	}
	@Override
	public String execute() {

		UserService service = new UserService();
		
		int a = service.regist(user);
		if( a > 0 )  {
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
}
 