package com.zy.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.Dao.MessageDao;
import com.zy.Model.Message;
import com.zy.Service.MessageService;
@Service
public class MessageServiceImpl implements MessageService{
@Autowired
MessageDao m;
	public void save(Message e) {
		m.save(e);
		
	}

	public void update(Message e) {
		// TODO Auto-generated method stub
		m.update(e);
	}

	public void delete(Message e) {
		// TODO Auto-generated method stub
		m.delete(e);
	}

	public Message get(int id) {
		// TODO Auto-generated method stub
		return m.get(id);
	}

	public List<Message> list() {
		// TODO Auto-generated method stub
		return m.list();
	}

	public List<Message> listbyid(Integer id) {
		// TODO Auto-generated method stub
		return m.listbyid(id);
	}



}
