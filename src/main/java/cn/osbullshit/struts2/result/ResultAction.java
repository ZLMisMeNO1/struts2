/** 
 * Project Name:struts2 
 * File Name:ResultAction.java 
 * Package Name:cn.osbullshit.struts2.result 
 * Date:2017年11月6日下午3:02:17 
 * 
 */  
  
package cn.osbullshit.struts2.result;  

import com.opensymphony.xwork2.Action;

/** 
 * ClassName:ResultAction 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月6日 下午3:02:17 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ResultAction implements Action {

	private String result;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}

}
 