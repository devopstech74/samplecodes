package ecommerceproject.samplebackend;

import java.sql.Driver;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@Configuration
@EnableTransactionManagement
public class SpringConfiguration {
/*	@Bean("product")
	public Product getProduct()
	{
		Product obj=new Product();
		obj.setProductName("Cofee");
		obj.setPrice(200);
		obj.setQauntity(200);
		return obj;
	}
*/
	public DataSource getH2DataSource()
	{
	
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/ecommerce");
		ds.setUsername("sa");
		ds.setPassword("");
		return ds;
	}
	@Bean(name="sessionFactory")
	 public SessionFactory getSessionFactory()
    {  
    	System.out.println("------Hibernate Properties----");
    	Properties prop = new Properties();
    	prop.setProperty("hibernate.hbm2ddl.auto", "update");
    	prop.put("hibernate.show_sql", "true");
    	prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
    	System.out.println("-----Hibernate properties created----");
    	
    	System.out.println("----Local session factory builder object creation----");
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
    	sessionBuilder.addProperties(prop);
    	System.out.println("-----Factory builder object created----");
    	sessionBuilder.addAnnotatedClass(Product.class);
    	


    	System.out.println("Session factory object creation");
    	SessionFactory sessionFactory = sessionBuilder.buildSessionFactory();
    	System.out.println("Session factory object created");
    	return sessionFactory;
    }
	@Bean("tx")
	public HibernateTransactionManager getTransactionManager()
	{
	HibernateTransactionManager manager=new HibernateTransactionManager(getSessionFactory());	
	return manager;
	}
	@Bean("productDAO")
	ProductDAO getProductDAO()
	{
		return new ProductDAOImpl();
	}
}
