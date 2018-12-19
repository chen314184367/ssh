package com.zy.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.Dao.DepartmentDao;
import com.zy.Model.Department;
import com.zy.Service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{
@Autowired
DepartmentDao d;

public void save(Department e) {
	// TODO Auto-generated method stub
	d.save(e);
}

public void update(Department e) {
	// TODO Auto-generated method stub
	d.update(e);
}

public void delete(Department e) {
	// TODO Auto-generated method stub
	d.delete(e);
	
}

public Department get(int id) {
	// TODO Auto-generated method stub
	return d.get(id);
}

public List<Department> list() {
	// TODO Auto-generated method stub
	return d.list();
}


}
