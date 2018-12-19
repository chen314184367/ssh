package com.zy.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zy.Model.User;
import com.zy.Service.UserService;

@Controller
public class UserLoginAction extends ActionSupport implements ModelDriven<User> {
	@Autowired
	UserService us;

	private static final long serialVersionUID = 1L;

	private User u = new User();

	private String username;
	private String password;

	public User getModel() {
		// TODO Auto-generated method stub
		return u;
	}



	public void validate() {
        User admin =new User();
		List<User> list = us.list();
		username = u.getUsername();
		password = u.getPassword();
		System.out.println(username + password);
		int a=0;
		for (User user : list) {
			if(user.getUsername().equals(username)&&user.getPassword().equals(password)){
				System.out.println("success");
				admin=user;
				a=1;
			}
		}
		if (a==0) {
			super.addFieldError("username", "�˺Ż����������");
			return;
		}

		String ss = "^[a-zA-Z]\\w{5,15}$";
		if (username == null || username.trim().length() < 6) {
			System.out.println("1");
			super.addFieldError("username", "�˻���Ϊ�ջ��߳���С��6");
			return;
		}
		if (!username.matches(ss)) {
			System.out.println("2");
			super.addFieldError("username", "�˺Ÿ�ʽ����");
			return;
		}

		String aa = "^\\w{5,15}$";
		if (password == null || password.trim().length() < 6) {
			System.out.println("3");
			super.addFieldError("password", "����Ϊ�ջ��߳���С��6");
			return;
		}
		if (!password.matches(aa)) {
			System.out.println("4");
			super.addFieldError("password", "�����ʽ����");
			return;
		}
		ActionContext.getContext().getSession().put("user", admin);
		super.validate();
	}

	@Override
	public String execute() throws Exception {
		System.out.println("����");
		return SUCCESS;
	}
	
	
}
