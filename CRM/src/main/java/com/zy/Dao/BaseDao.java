package com.zy.Dao;

import java.util.List;

public interface BaseDao<E> {

	void save(E e);
	 void update(E e);
	 void delete(E e);
	 E get(int id);
	List<E> list();
}
