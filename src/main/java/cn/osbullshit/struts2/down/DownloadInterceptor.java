/** 
 * Project Name:struts2 
 * File Name:DownloadInterceptor.java 
 * Package Name:cn.osbullshit.struts2.down 
 * Date:2017年11月21日上午9:46:52 
 * 
 */  
  
package cn.osbullshit.struts2.down;  


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/** 
 * ClassName:DownloadInterceptor 
 * Function: TODO ADD FUNCTION. 
 * Date:     2017年11月21日 上午9:46:52 
 * @author   baoqi.zhang 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class DownloadInterceptor  implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Override
	public void destroy() {
		System.out.println("拦截器销毁");
	}

	@Override
	public void init() {
		System.out.println("拦截器初始化");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("拦截器开始运行");
		ActionContext act = invocation.getInvocationContext();
		Integer userId = (Integer)act.getSession().get("userId");
		if(userId == null || userId < 0 ) {
			return Action.LOGIN;
		}
		System.out.println("拦截器结束运行");
		return Action.SUCCESS;
	}

}
 