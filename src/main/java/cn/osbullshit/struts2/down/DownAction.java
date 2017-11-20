/** 
 * Project Name:struts2 
 * File Name:DownAction.java 
 * Package Name:cn.osbullshit.struts2.down 
 * Date:2017年11月20日上午10:45:36 
 * 
 */  
  
package cn.osbullshit.struts2.down;  

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * ClassName:DownAction 
 * 通用的文件下载Action：
 * 	1.如下内容是可变的
 *  2.下载的文件类型
 *  3.下载的文件名
 *  
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月20日 上午10:45:36 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */

public class DownAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String res;//下载的资源
	
	private String resType;//资源类型
	
	private String resName ; //文件名

	public String getRes() {
		return res;
	}

	public void setRes(String res) throws Exception {
		//对中文问题进行处理
		this.res = new String(res.getBytes("iso-8859-1"),"utf-8");
	}

	public String getResType() {
		return resType;
	}

	public void setResType(String resType) {
		this.resType = resType;
	}

	public String getResName() {
		return resName;
	}

	public void setResName(String resName) {
		this.resName = resName;
	}

	//该方法代表了文件下载的入口，它就是让客户下载的输入流
	public InputStream getTarget() throws Exception{
		//默认文件路径在webapp/WEB-INF/下
		return new FileInputStream(ServletActionContext.getServletContext()
				.getRealPath(res));
	}
	
}
 