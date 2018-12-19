package com.zy.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.Dao.CustomerDao;
import com.zy.Model.Customer;
import com.zy.Service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService{
@Autowired
CustomerDao c;
	public void save(Customer e) {
		c.save(e);
		
	}

	public void update(Customer e) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Customer e) {
		// TODO Auto-generated method stub
		
	}

	public Customer get(int id) {
		// TODO Auto-generated method stub
		return c.get(id);
	}

	public List<Customer> list() {
		// TODO Auto-generated method stub
		return c.list();
	}

}
