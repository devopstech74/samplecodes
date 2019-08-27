package springproject.springbackend;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
@Configuration
public class SpringConfiguration {
	@Bean
	public Product getProduct()
	{
		Product obj=new Product();
		obj.setProductName("Cofee");
		obj.setPrice(200);
		obj.setProductid(1);
		return obj;
	}
	 @Bean("dataSource")
	 public DataSource getH2DataSource()
     {
     	System.out.println("Starting of the method getH2DataSource");
     	DriverManagerDataSource dataSource = new DriverManagerDataSource();
     	dataSource.setDriverClassName("org.h2.Driver");
     	dataSource.setUrl("jdbc:h2:tcp://localhost/~/ecommerce");
     	dataSource.setUsername("sa");
     	dataSource.setPassword("");
     	System.out.println("Data source creation");
     	return dataSource;
     }
	  @Bean(name="sessionFactory")
		 public SessionFactory getSessionFactory(DataSource dataSource)
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
}
