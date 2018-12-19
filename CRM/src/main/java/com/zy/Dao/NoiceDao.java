package com.zy.Dao;

import java.util.List;

import com.zy.Model.Notice;

public interface NoiceDao extends BaseDao<Notice>{

	List<Notice> search(String a,String b);
}
