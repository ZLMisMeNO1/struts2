/** 
 * Project Name:struts2 
 * File Name:UserService.java 
 * Package Name:cn.osbullshit.struts2.converter 
 * Date:2017年11月20日下午3:10:59 
 * 
 */  
  
package cn.osbullshit.struts2.converter;  

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** 
 * ClassName:UserService 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月20日 下午3:10:59 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UserService {

	private static List<UserBean> userDbs = new ArrayList<UserBean> ();
	
	public void regist(UserBean bean) {
		userDbs.add(bean);
	}
	
	public List<UserBean> getList () {
		return userDbs;
	}
}
 