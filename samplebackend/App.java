package ecommerceproject.samplebackend;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      try {
	//	ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfiguration.xml");
	  ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfiguration.class);
    	  Product product=(Product)ctx.getBean("product");
	    System.out.println(product.getProductName());
	    System.out.println(product.getPrice());
      } catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      

    }
}
