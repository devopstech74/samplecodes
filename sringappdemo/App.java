package springprojectgroup.sringappdemo;

/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("helloworld.xml");
    	
    	HelloWorld hello=(HelloWorld)context.getBean("hello");
    	System.out.println(hello.getHello());
        
    }
}
