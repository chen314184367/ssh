package com.zy.DaoImpl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zy.Dao.MessageDao;
import com.zy.Model.Message;
@Repository
public class MessageDaoImpl extends BaseDaoImpl<Message> implements MessageDao{
	
	public List<Message> listbyid(Integer id) {
		DetachedCriteria xx = DetachedCriteria.forClass(Message.class);
		xx.add(Restrictions.like("receiver", id));
		List<Message> find = (List<Message>)this.getHibernateTemplate().findByCriteria(xx);
		return find;
	}
}
