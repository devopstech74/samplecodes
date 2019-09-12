package ecommerce.com.backend;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import dao.CartDAO;
import dao.CartDAOImpl;
import dao.ProductDAO;
import dao.ProductDAOImpl;
import ecommerce.com.model.Cart;
import ecommerce.com.model.Category;
import ecommerce.com.model.Product;
import ecommerce.com.model.Supplier;
import ecommerce.com.model.User;

import java.util.Properties;
@Configuration
@EnableTransactionManagement
public class SpringConfiguration {

	@Bean("dataSource")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/ecommerce");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
		
	}
	@Bean("sessionFactory") 
	public SessionFactory getSessionFactory()
	{
	
		Properties properties=new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibenate.dialect","org.hibernate.dialect.H2Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(getDataSource());
		builder.addAnnotatedClass(Product.class);
		builder.addAnnotatedClass(Supplier.class);
		builder.addAnnotatedClass(Category.class);
		builder.addAnnotatedClass(Cart.class);
		builder.addAnnotatedClass(User.class);
		builder.addProperties(properties);
        SessionFactory factory=builder.buildSessionFactory();
        return factory;
	
	}
	@Bean("tx")
	public HibernateTransactionManager getTransactionManager()
	{
		HibernateTransactionManager manager=new HibernateTransactionManager(getSessionFactory());
	 return manager;
	}
	@Bean("productDAO")
	public ProductDAO getProductDAO()
	{
		return new ProductDAOImpl();
	}
	@Bean("cartDAO")
	public CartDAO getCartDAO()
	{
		return new CartDAOImpl();
	}
	
	
}
