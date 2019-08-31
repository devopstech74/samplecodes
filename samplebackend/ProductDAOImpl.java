package ecommerceproject.samplebackend;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product p) {
		sessionFactory.getCurrentSession().save(p);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) {
		sessionFactory.getCurrentSession().delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return true;
	}

	@Override
	public Product findProduct(int id) {
		Product p=sessionFactory.getCurrentSession().find(Product.class, id);
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public List<Product> getAllProducts() {
		
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Product p").getResultList();
	}

}
