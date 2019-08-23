package springproject.springbackend;

import org.springframework.beans.BeansException;
/**
 * Hello world!
 *
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springproject.springbackend.resource.Resource;
public class App 
{
    public static void main( String[] args )
    {
try {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("springbean.xml");
Product pr=(Product)ctx.getBean("product");



/*ProductDAO productdao=(ProductDAO)ctx.getBean("productDAO");
productdao.addProduct(pr);
productdao.find(pr.getProductid());
*/

/*Supplier supplier=(Supplier)ctx.getBean("supplier");
System.out.println(supplier.getProduct().getProductName());*/
Resource resource=(Resource)ctx.getBean("resource");
resource.getDetails();
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        
    }
}
