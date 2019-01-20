package services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.userDao;
import entity.user;

@Service
public class UserService    {
	userDao u;

	

	public userDao getU() {
		return u;
	}
	
	@Autowired
	public void setU(userDao u) {
		this.u = u;
	}

	public void saveOrUpdate(user u) {
		getU().saveOrUpdate(u);
		
	}
	

	public ArrayList<user> getAll() {
		// TODO Auto-generated method stub
		return getU().getAll();
	}
	
	
}
