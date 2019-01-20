package services;



import java.util.ArrayList;

import entity.user;

public interface UserServiceInterface {
	public void saveOrUpdate(user u);
	public ArrayList<user> getAll();
}
