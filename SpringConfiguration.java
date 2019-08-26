package springproject.springbackend;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
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
}
