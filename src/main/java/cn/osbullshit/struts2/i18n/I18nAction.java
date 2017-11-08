/** 
 * Project Name:struts2 
 * File Name:I18nAction.java 
 * Package Name:cn.osbullshit.struts2 
 * Date:2017年11月8日上午11:20:20 
 * 
 */  
  
package cn.osbullshit.struts2.i18n;  

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:I18nAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月8日 上午11:20:20 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class I18nAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	
	private String pass;

	private String  tip;
	
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

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

	@Override
	public String execute() throws Exception {
		
		if(name.equals("admin") && pass.equals("123")) {
			setTip(getText("success",new String[]{name}));
		} else {
			setTip(getText("error"));
		}
		return SUCCESS;
		
	}
	
	

}
 