package com.zy.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zy.Model.Customer;
import com.zy.Service.CustomerService;

@Controller
public class CustomerAction extends ActionSupport{
@Autowired
CustomerService ccs;

public String view(){
	List<Customer> list = ccs.list();
	System.out.println(list);
	ActionContext.getContext().put("list", list);
	
	return SUCCESS;
	
}
}
