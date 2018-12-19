package com.zy.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zy.Model.Message;
import com.zy.Model.User;
import com.zy.Service.MessageService;

@Controller
public class messageAction extends ActionSupport{

	@Autowired
	MessageService ms;
	
	public String messageView(){
		System.out.println("messageView");
		User u = (User) ActionContext.getContext().getSession().get("user");
		System.out.println(u.getUserId());
		List<Message> list = ms.listbyid(u.getUserId());
		ActionContext.getContext().put("list", list);
		System.out.println(list);
		return SUCCESS;
		
	}
}
