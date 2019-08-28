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
    
 ProductDAO daoimpl=(ProductDAO)ctx.getBean("productDAO");
/*Product p=new Product();
 p.setProductName("Tea");
 p.setPrice(100);
 p.setCategoryId(1);
 p.setSupplierId(1);
if( daoimpl.addProduct(p))
{
	System.out.println("product added");
}*/
 
 //Product p=daoimpl.find(1);
 //daoimpl.deleteProduct(p);
 //p.setPrice(400);
// daoimpl.updateProduct(p);
 //System.out.println(p.getProductName());
java.util.List<Product> list=daoimpl.getAllProducts();
for(Product p :list)
{
	System.out.println(p.getProductName()+" "+p.getPrice()+" "+p.getProductid());
}
} catch (Throwable e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
        
    }
}
