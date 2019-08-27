package springproject.springbackend;

import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springproject.springbackend.resource.Resource;
public class App 
{
    public static void main( String[] args )
    {
try {
	ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfiguration.class);
    
  SessionFactory sf=(SessionFactory)ctx.getBean("sessionFactory");
  Session session=sf.openSession();
  
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        
    }
}
