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
		System.out.println("����������"+ob);
		
		if (ob!=null) {
			System.out.println("����");
			if (ob.getStatus()==2) {
				 return invocation.invoke(); 
			}
			ActionContext.getContext().put("nor", "���ǹ���Աû��Ȩ��");
			return "home";
		}else   
			
			ActionContext.getContext().put("nor", "û�е�¼���ȵ�¼");
		return "login";  
		
 
	}

}
