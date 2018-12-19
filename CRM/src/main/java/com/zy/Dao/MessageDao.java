package com.zy.Dao;

import java.util.List;

import com.zy.Model.Message;

public interface MessageDao extends BaseDao<Message>{

List<Message> listbyid(Integer id) ;
}
