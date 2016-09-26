package com.testSSH.service;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CountryService {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	//返回国家列表
	public List showCountry(){
		return sessionFactory.getCurrentSession().createQuery("from Province").list();
	}
	
}
