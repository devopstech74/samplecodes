package dao;

import ecommerce.com.model.Supplier;

public interface SupplierDAO {

	boolean addSupplier(Supplier p);
	boolean deleteSupplier(Supplier p);
	Supplier findSupplier(int id);
	Supplier updateSupplier(Supplier p);
	java.util.List<Supplier> getAllSuppliers();
	
}
