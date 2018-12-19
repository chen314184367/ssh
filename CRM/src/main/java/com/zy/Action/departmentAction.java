package com.zy.Action;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.zy.Model.Department;
import com.zy.Model.Role;
import com.zy.Model.User;
import com.zy.Service.DepartmentService;
import com.zy.Service.RoleService;

import lombok.Getter;
import lombok.Setter;

@Controller
public class departmentAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
@Autowired
DepartmentService ds;
@Setter
@Getter
private Department d;


Date date = new Date();

    public String departmentView(){
    	 List<Department> list = ds.list();
    	System.out.println(list);
		ActionContext.getContext().put("list", list);
		return SUCCESS;
    }
    
    public String departmentAdd(){
    	User ob = (User)ActionContext.getContext().getSession().get("user");
        d.setCreater(ob.getUserId());
    	System.out.println("进入添加   方法");
    	d.setCreateTime(date);
		ds.save(d);
		return SUCCESS;
    	
    }
    
    public String departmentUpdateReady(){
    	
    	System.out.println("roleUpdateReady");
		System.out.println("r.getRoleId()"+d.getDepartmentId());
		d = ds.get(d.getDepartmentId());
		ActionContext.getContext().put("d", d);
		return SUCCESS;
    	
    }
    public String departmentUpdate(){
    	User ob = (User)ActionContext.getContext().getSession().get("user");
    	System.out.println("d"+d+"ob:"+ob.getUserId());
    	
    	d.setUpdater(ob.getUserId());
    	d.setUpdateTime(date);
	     ds.update(d);
		return SUCCESS;   	
    }
    
    public String departmentDelete(){
    	System.out.println("dID"+d.getDepartmentId());
    	ds.delete(d);
		return SUCCESS;	
    }
}
