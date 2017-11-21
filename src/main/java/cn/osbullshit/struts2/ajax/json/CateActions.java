/** 
 * Project Name:struts2 
 * File Name:CateActions.java 
 * Package Name:cn.osbullshit.struts2.ajax.json 
 * Date:2017年11月21日上午11:41:19 
 * 
 */  
  
package cn.osbullshit.struts2.ajax.json;  

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:CateActions 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午11:41:19 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class CateActions extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<String> cates;

	public List<String> getCates() {
		return cates;
	}

	public void setCates(List<String> cates) {
		this.cates = cates;
	}
	
	@Override
	public String execute() {
		BookService service = new BookService();
		setCates(service.listCates());
		return SUCCESS;
	}
	
}
 