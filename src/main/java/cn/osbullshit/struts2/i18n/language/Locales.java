/** 
 * Project Name:struts2 
 * File Name:Locales.java 
 * Package Name:cn.osbullshit.struts2.i18n.language 
 * Date:2017年11月8日下午6:43:54 
 * 
 */  
  
package cn.osbullshit.struts2.i18n.language;  

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/** 
 * ClassName:Locales 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月8日 下午6:43:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Locales {

	private  Map<String,Locale> locales;
	
	public Locales() {
		
		locales = new HashMap<String,Locale>();
		locales.put(Locale.CHINA.getDisplayLanguage(Locale.CHINA),Locale.CHINA);
		locales.put(Locale.US.getDisplayLanguage(Locale.US),Locale.US);
	}
	
	public  Map<String,Locale> getLocales() {
		return locales;
	}
	
}
 