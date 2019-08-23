package springproject.springbackend;

public class ProductDAOImpl implements ProductDAO{

	@Override
	public boolean addProduct(Product p) {
		// TODO Auto-generated method stub
		System.out.println(p.getProductName());
		System.out.println(p.getPrice());
		return true;
	}

	@Override
	public boolean find(int id) {
     System.out.println("finding product with id "+id);
		
		// TODO Auto-generated method stub
		return true;
	}

}
