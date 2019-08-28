package springproject.springbackend;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		session.save(p);
		return true;
	}

	@Override
	public Product find(int id) {
     System.out.println("finding product with id "+id);
		
	Session session=sessionFactory.getCurrentSession();
	Query query=session.createQuery("from Product p where p.productid="+id);
	List<Product> productlist=query.list();
	
	return productlist.get(0);
	}

	@Override
	public Product updateProduct(Product p) {
		Session session=sessionFactory.getCurrentSession();
		session.update(p);
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public boolean deleteProduct(Product p) {
		
		Session session=sessionFactory.getCurrentSession();
		session.delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public List<Product> getAllProducts() {
		
		
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from Product p");
		List<Product> productlist=query.list();
		return productlist;
	}

}
