package com.zy.Action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zy.Model.Role;
import com.zy.Model.User;
import com.zy.Service.RoleService;

import lombok.Getter;
import lombok.Setter;

@Controller
public class roleAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
@Autowired
RoleService rs;
@Setter
@Getter
private Role r;


Date date = new Date();

    public String roleView(){
    	List<Role> list = rs.list();
    	System.out.println(list);
		ActionContext.getContext().put("list", list);
		return SUCCESS;
    }
    
    public String roleAdd(){
    	User ob = (User)ActionContext.getContext().getSession().get("user");
        r.setCreater(ob.getUserId());
    	System.out.println("进入添加  role 方法");
    	r.setCreateTime(date);
		rs.save(r);
		return SUCCESS;
    	
    }
    
    public String roleUpdateReady(){
    	
    	System.out.println("roleUpdateReady");
		System.out.println("r.getRoleId()"+r.getRoleId());
		r = rs.get(r.getRoleId());
		ActionContext.getContext().put("r", r);
		return SUCCESS;
    	
    }
    public String roleUpdate(){
    	User ob = (User)ActionContext.getContext().getSession().get("user");
    	System.out.println("r"+r);
    	r.setUpdater(ob.getUserId());
    	r.setUpdateTime(date);
	     rs.update(r);
		return SUCCESS;   	
    }
    
    public String roleDelete(){
    	System.out.println("rID"+r.getRoleId());
    	rs.delete(r);
		return SUCCESS;	
    }
}
