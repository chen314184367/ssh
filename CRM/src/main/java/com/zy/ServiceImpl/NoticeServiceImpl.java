package com.zy.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zy.Dao.NoiceDao;
import com.zy.Model.Notice;
import com.zy.Model.User;
import com.zy.Service.NoticeService;
@Service
public class NoticeServiceImpl implements NoticeService{
@Autowired
NoiceDao u;

public void save(Notice e) {
	// TODO Auto-generated method stub
	u.save(e);
}

public void update(Notice e) {
	// TODO Auto-generated method stub
	u.update(e);
}

public void delete(Notice e) {
	// TODO Auto-generated method stub
	u.delete(e);
}

public Notice get(int id) {
	// TODO Auto-generated method stub
	return u.get(id);
}

public List<Notice> list() {
	// TODO Auto-generated method stub
	return u.list();
}

public List<Notice> search(String a, String b) {
	// TODO Auto-generated method stub
	return u.search(a, b);
}

}
