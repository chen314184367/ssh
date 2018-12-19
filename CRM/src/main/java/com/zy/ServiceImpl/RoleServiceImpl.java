package com.zy.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.Dao.RoleDao;
import com.zy.Model.Role;
import com.zy.Service.RoleService;
@Service
public class RoleServiceImpl implements RoleService{
@Autowired
RoleDao u;

public void save(Role e) {
	// TODO Auto-generated method stub
	u.save(e);
}

public void update(Role e) {
	// TODO Auto-generated method stub
	u.update(e);
}

public void delete(Role e) {
	// TODO Auto-generated method stub
	u.delete(e);
}

public Role get(int id) {
	// TODO Auto-generated method stub
	return u.get(id);
}

public List<Role> list() {
	// TODO Auto-generated method stub
	return u.list();
}
	
}
