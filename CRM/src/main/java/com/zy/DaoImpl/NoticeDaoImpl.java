package com.zy.DaoImpl;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.zy.Dao.NoiceDao;
import com.zy.Model.Notice;


@Repository
public class NoticeDaoImpl extends BaseDaoImpl<Notice> implements NoiceDao{
       
	public List<Notice> search(String a, String b) {
		DetachedCriteria xx = DetachedCriteria.forClass(Notice.class);
		if (a.equals("creater")||a.equals("receiveId")) {
			Integer s = Integer.valueOf(b);
			xx.add(Restrictions.like(a, s));
		}else{
		xx.add(Restrictions.like(a, "%"+b+"%"));
		}
		List<Notice> find = (List<Notice>)this.getHibernateTemplate().findByCriteria(xx);
		
		return find;
	}
	

}
