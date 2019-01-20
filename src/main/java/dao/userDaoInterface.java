package dao;

import entity.user;

public interface userDaoInterface {
	public void saveOrUpdate(user u);
	public java.util.ArrayList<user> getAll();
}
