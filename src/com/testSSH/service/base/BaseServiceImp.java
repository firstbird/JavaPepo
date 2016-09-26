package com.testSSH.service.base;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class BaseServiceImp implements BaseServiceInter {

	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List getResult(String hql, Object[] params) {
		// TODO Auto-generated method stub
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		if (params != null || params.length > 0) {
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		return query.list();
	}

	@Override
	public void Save(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void Delete(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(obj);
	}

	@Override
	public void Update(Object obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(obj);
	}

}
