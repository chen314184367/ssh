package com.zy.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zy.Dao.Userdao;
import com.zy.Model.User;

@Repository
public class userimp extends BaseDaoImpl<User> implements Userdao {
	@Autowired
	SessionFactory sf;

	public List<User> search(String a, String b) {
		System.out.println("½øÈëËÑË÷");
		DetachedCriteria xx = DetachedCriteria.forClass(User.class);
		if (a.equals("email") || a.equals("username")) {
			xx.add(Restrictions.like(a, "%" + b + "%"));
		} else {
			Integer s = Integer.valueOf(b);
			xx.add(Restrictions.like(a, s));
		}

		List<User> find = (List<User>) this.getHibernateTemplate().findByCriteria(xx);

		return find;
	}

}
