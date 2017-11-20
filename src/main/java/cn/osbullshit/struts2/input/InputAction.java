/** 
 * Project Name:struts2 
 * File Name:InputAction.java 
 * Package Name:cn.osbullshit.struts2.input 
 * Date:2017年11月20日下午4:33:50 
 * 
 */  
  
package cn.osbullshit.struts2.input;  

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;

/** 
 * ClassName:InputAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月20日 下午4:33:50 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class InputAction extends ActionSupport{

	private UserBean user;
	
	public UserBean getUser() {
		return user;
	}

	@Validations(requiredStrings={@RequiredStringValidator(fieldName="user.name",key="usernamerequire2"),
			@RequiredStringValidator(fieldName="user.id",key="useridrequire")})
	public void setUser(UserBean user) {
		this.user = user;
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
}
 