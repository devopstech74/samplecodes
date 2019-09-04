package dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ecommerce.com.model.Cart;
import ecommerce.com.model.Cart;

@Repository
@Transactional
public class CartDAOImpl implements CartDAO {

	@Autowired 
	SessionFactory sessionFactory;
	public boolean addCart(Cart p) {
      sessionFactory.getCurrentSession().save(p);		
	
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteCart(Cart p) {
	      sessionFactory.getCurrentSession().delete(p);		
	  	
		// TODO Auto-generated method stub
		return true;
	}

	public Cart findCart(int id) {
		// TODO Auto-generated method stub
		Cart p=      sessionFactory.getCurrentSession().find(Cart.class,id);		
		
		return p;
	}

	public Cart updateCart(Cart p) {
	      sessionFactory.getCurrentSession().update(p);		
	  	
		// TODO Auto-generated method stub
		return p;
	}

	public List<Cart> getAllCarts() {
		
	    return  sessionFactory.getCurrentSession().createQuery("from Cart p").list()	;	
	  	
		// TODO Auto-generated method stub
		
	}
	
	

}
