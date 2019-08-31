package ecommerceproject.samplebackend;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	SessionFactory sessionFactory;
	@Override
	public boolean addSupplier(Supplier p) {
		sessionFactory.getCurrentSession().save(p);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean deleteSupplier(Supplier p) {
		sessionFactory.getCurrentSession().delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateSupplier(Supplier p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return true;
	}

	@Override
	public Supplier findSupplier(int id) {
		Supplier p=sessionFactory.getCurrentSession().find(Supplier.class, id);
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public List<Supplier> getAllSuppliers() {
		
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Supplier p").getResultList();
	}

}
