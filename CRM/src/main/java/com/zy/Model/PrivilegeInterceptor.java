package com.zy.Model;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class PrivilegeInterceptor extends MethodFilterInterceptor {

	
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		User ob = (User) ActionContext.getContext().getSession().get("user");
		System.out.println("进入拦截器"+ob);
		
		if (ob!=null) {
			System.out.println("放行");
			if (ob.getStatus()==2) {
				 return invocation.invoke(); 
			}
			ActionContext.getContext().put("nor", "不是管理员没有权限");
			return "home";
		}else   
			
			ActionContext.getContext().put("nor", "没有登录请先登录");
		return "login";  
		
 
	}

}
