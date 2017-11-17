/** 
 * Project Name:struts2 
 * File Name:ControllerLabel.java 
 * Package Name:cn.osbullshit.struts2.label 
 * Date:2017年11月10日下午1:59:32 
 * 
 */  
  
package cn.osbullshit.struts2.label;  

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:ControllerLabel 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月10日 下午1:59:32 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ControllerLabel extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String admin;
	
	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	private List<String> listUsers ;

	public List<String> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<String> listUsers) {
		this.listUsers = listUsers;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("被调用了");
		listUsers = new ArrayList<String>();
		if(admin.equals("user")) {
			listUsers.add("武松");
			listUsers.add("鲁智深");
			listUsers.add("林冲");
		} else {
			listUsers.add("1");
			listUsers.add("2");
			listUsers.add("3");
		}
		setListUsers(listUsers);
		return SUCCESS;
	}
	
	

}
 