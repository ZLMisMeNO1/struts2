/** 
 * Project Name:struts2 
 * File Name:MessageAction.java 
 * Package Name:cn.osbullshit.struts2.msg 
 * Date:2017年11月17日下午5:36:58 
 * 
 */  
  
package cn.osbullshit.struts2.msg;  

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:MessageAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月17日 下午5:36:58 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class MessageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		addActionError("尼玛出错了");
		addActionMessage("尼玛这是消息");
		return super.execute();
	}
	
	

}
 