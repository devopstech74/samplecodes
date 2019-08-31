package ecommerceproject.samplebackend;

public interface SupplierDAO {
	public boolean addSupplier(Supplier p);
	public boolean deleteSupplier(Supplier p);
	public boolean updateSupplier(Supplier p);
	public Supplier findSupplier(int id);
	public java.util.List<Supplier> getAllSuppliers();


}
