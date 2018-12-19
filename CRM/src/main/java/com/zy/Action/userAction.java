package com.zy.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zy.Model.User;
import com.zy.Service.UserService;

import lombok.Getter;
import lombok.Setter;

@Controller
public class userAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	@Autowired
	UserService uus;
	@Setter
	@Getter
	private User u ;
	@Setter
	@Getter
    private String usertype;
	@Setter
	@Getter
    private String usercontext;
	
	public String espect() {
		System.out.println("进入删除方法");
		ServletActionContext.getRequest().getSession().invalidate();
		
		return SUCCESS;
		
	}
	
	
	public String userSearch(){
		System.out.println("usertype:"+usertype+"     ,      usercontext:"+usercontext);
		  List<User> list = uus.search(usertype,usercontext);
		  System.out.println(list);
		System.out.println("userActionSearch");
		ActionContext.getContext().put("list", list);
		
		return SUCCESS;
		
	}
	
	public String userView(){
		List<User> list = uus.list();
		System.out.println(list);
		ActionContext.getContext().put("list", list);
		
		return SUCCESS;
		
	}
	

	public String userAdd() {
		System.out.println("进入userAdd方法");
		System.out.println(u);
		uus.save(u);
		System.out.println("asdawd1568a7874");
		return SUCCESS;			
	}
	
	public String userUpdateReady(){
		System.out.println("userUpdateReady");
		System.out.println("u.getUserId()"+u.getUserId());
		u = uus.get(u.getUserId());
		ActionContext.getContext().put("us", u);
		return SUCCESS;	
	}
	
	public String userUpdate(){
		System.out.println("userUpdate");
		System.out.println(u);
	     uus.update(u);	
		return SUCCESS;
		
	}
	
	public String userDelete(){
		System.out.println("userDelete");
		System.out.println("u.getUserId()"+u.getUserId());
		uus.delete(u);
		return SUCCESS;
		
	}
}
