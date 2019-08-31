package ecommerceproject.samplebackend;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	SessionFactory sessionFactory;
	public boolean addCategory(Category p) {
		sessionFactory.getCurrentSession().save(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean deleteCategory(Category p) {
		sessionFactory.getCurrentSession().delete(p);
		// TODO Auto-generated method stub
		return true;
	}

	public boolean updateCategory(Category p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(p);
		return true;
	}

	public Category findCategory(int id) {
		Category p=sessionFactory.getCurrentSession().find(Category.class, id);
		// TODO Auto-generated method stub
		return p;
	}

	public List<Category> getAllCategories() {
		
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from  Category p").getResultList();
	}

}
