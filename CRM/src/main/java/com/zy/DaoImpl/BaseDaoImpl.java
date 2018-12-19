package com.zy.DaoImpl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zy.Dao.BaseDao;


@SuppressWarnings("unchecked")
public class BaseDaoImpl<E> extends HibernateDaoSupport implements BaseDao<E> {
	@Autowired
	public final void setSuperSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	private Class entityClass;

	public BaseDaoImpl() {
		super();
		ParameterizedType superclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		Type[] actualTypeArguments = superclass.getActualTypeArguments();
		entityClass = (Class<E>) actualTypeArguments[0];
	}

	
	public void save(E e) {
		this.getHibernateTemplate().save(e);
		System.out.println("successssssssss");
	}

	public void update(E e) {
		this.getHibernateTemplate().update(e);
	}

	public void delete(E e) {
		this.getHibernateTemplate().delete(e);
	}

	public List<E> list() {
		
		List<E> find = (List<E>) this.getHibernateTemplate().find("from " + entityClass.getName());

		return find;
	}

	public E get(int id) {
		Object object = this.getHibernateTemplate().get(entityClass, id);
		return (E) object;

	}

}
