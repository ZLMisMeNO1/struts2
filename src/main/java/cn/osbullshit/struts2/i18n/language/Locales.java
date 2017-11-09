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

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:Locales 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月8日 下午6:43:54 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Locales extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private  Map<String,Locale> locales;
	
	
	public Map<String, Locale> getLocales() {
		return locales;
	}

	public void setLocales(Map<String, Locale> locales) {
		this.locales = locales;
	}

	private Locale current;

	public Locale getCurrent() {
		return current;
	}

	public void setCurrent(Locale current) {
		this.current = current;
	}

	@Override
	public String execute() throws Exception {
		locales = new HashMap<String,Locale>();
		locales.put(Locale.CHINA.getDisplayLanguage(Locale.CHINA),Locale.CHINA);
		locales.put(Locale.US.getDisplayLanguage(Locale.US),Locale.US);
		locales.put(Locale.JAPAN.getDisplayLanguage(Locale.JAPAN),Locale.JAPAN);
		locales.put(Locale.KOREA.getDisplayLanguage(Locale.KOREA),Locale.KOREA);
		setLocales(locales);
		return SUCCESS;
	}
	
	
	
}
 