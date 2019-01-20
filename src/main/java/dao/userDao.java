package dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.user;

@Repository
@Transactional
public class userDao implements userDaoInterface {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public void saveOrUpdate(user u) {
		getSessionFactory().getCurrentSession().saveOrUpdate(u);
		
	}


	public ArrayList<user> getAll() {
		return (ArrayList<user>) getSessionFactory().getCurrentSession().createQuery("from users").list();
	}
	
	
	
	
}
