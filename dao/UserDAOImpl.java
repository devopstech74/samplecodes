package dao;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.UserDAO;
import ecommerce.com.model.User;
import ecommerce.com.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired 
	SessionFactory sessionFactory;
	public boolean addUser(User p) {
      sessionFactory.getCurrentSession().save(p);		
	
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteUser(User p) {
	      sessionFactory.getCurrentSession().delete(p);		
	  	
		// TODO Auto-generated method stub
		return true;
	}

	public User findUser(String id) {
		// TODO Auto-generated method stub
		User p=      sessionFactory.getCurrentSession().find(User.class,id);		
		
		return p;
	}

	public User updateUser(User p) {
	      sessionFactory.getCurrentSession().update(p);		
	  	
		// TODO Auto-generated method stub
		return p;
	}

	public List<User> getAllUsers() {
		
	    return  sessionFactory.getCurrentSession().createQuery("from User p").list()	;	
	  	
		// TODO Auto-generated method stub
		
	}
	
	
}
