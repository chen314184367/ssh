package com.zy.Dao;

import java.util.List;

import com.zy.Model.User;

public interface Userdao extends BaseDao<User> {

	List<User> search(String a,String b);
	
}
