/** 
 * Project Name:struts2 
 * File Name:UserConverter.java 
 * Package Name:cn.osbullshit.struts2.converter 
 * Date:2017年11月20日下午3:14:32 
 * 
 */  
  
package cn.osbullshit.struts2.converter;  

import java.util.Map;
import java.util.Random;

import org.apache.struts2.util.StrutsTypeConverter;

/** 
 * ClassName:UserConverter 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月20日 下午3:14:32 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class UserConverter extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		
		if(values.length == 1) {
			String[] vals = values[0].split(",");
			UserBean user = new UserBean();
			user.setId(new Random().nextInt(9999));
			user.setName(vals[0]);
			user.setPass(vals[1]);
			user.setHeight(Integer.parseInt(vals[2]));
			return user;
		}
		UserBean[] users = new UserBean[values.length];
		for(int i=0;i<values.length;i++) {
			String[] vals = values[i].split(",");
			UserBean user = new UserBean();
			user.setId(new Random().nextInt(9999));
			user.setName(vals[0]);
			user.setPass(vals[1]);
			user.setHeight(Integer.parseInt(vals[2]));
			users[i] = user;
		}
		return users;
	}

	@Override
	public String convertToString(Map context, Object o) {
		
		return null;
	}

}
 