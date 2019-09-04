package dao;

import ecommerce.com.model.User;

public interface UserDAO {
	boolean addUser(User p);
	boolean deleteUser(User p);
	User findUser(String email);
	User updateUser(User p);
	java.util.List getAllUsers();

}
