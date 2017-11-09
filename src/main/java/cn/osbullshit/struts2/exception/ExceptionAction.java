/** 
 * Project Name:struts2 
 * File Name:ExceptionAction.java 
 * Package Name:cn.osbullshit.struts2.exception 
 * Date:2017年11月9日上午11:31:06 
 * 
 */  
  
package cn.osbullshit.struts2.exception;  

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:ExceptionAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月9日 上午11:31:06 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ExceptionAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String pass;
	
	private String tip;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}



	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	@Override
	public String execute() throws Exception {
		if(name.equalsIgnoreCase("sql")) {
			throw new SQLException("用户名不能为sql字符串");
		}
		if(name.length() > 10) {
			throw new IllegalArgumentException("非法的参数异常");
		}
		if(name.equals("admin")
				&& pass.equals("123")) {
			setTip("登陆成功");
		} else {
			setTip("登录失败");
		}
		return super.execute();
	}
	
	

}
 