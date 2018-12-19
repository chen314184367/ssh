package com.zy.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.Dao.Userdao;
import com.zy.Model.User;
import com.zy.Service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
Userdao u;
	public void save(User e) {
		// TODO Auto-generated method stub
		u.save(e);
	}

	public void update(User e) {
		// TODO Auto-generated method stub
		u.update(e);
	}

	public void delete(User e) {
		// TODO Auto-generated method stub
		u.delete(e);
	}

	public User get(int id) {
		
		return u.get(id);
	}

	public List<User> list() {
		
		return u.list();
	}



	public List<User> search(String a, String b) {
		// TODO Auto-generated method stub
		return u.search(a, b);
	}

}
