package work;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import work.dataAccess.ProductDao;
import work.entities.Product;
public class Main {

	public static void main(String[] args) throws Exception {
		// SQL BAĞLANTISI KURMA
	    Connection connection = PostgresqlConnection.getConnection();
		System.out.println(connection.getMetaData().getDatabaseProductName());
		ProductDao productDao = new ProductDao(connection);

		
		
		// SQL'E VERİ EKLEME
		
		/*
		 * Product product = new Product(); product.setId(1);
		 * product.setProductName("Laptop");
		 * 
		 * 
		 * productDao.insert(product);
		 * 
		 * PostgresqlConnection.closeConnection();
		 */
        

	    // Ürün silme işlemi
	    //productDao.deleteProduct(5);
		
	    // Ürüm güncelleme işlemi
	    //Product product = new Product(1, "Yeni Akıllı telefon", new Double("1999.99"));
	    //productDao.update(product);
		
		/*Product product = productDao.findById(1);
		if (product != null) {
		    System.out.println("Found product with id " + product.getId() + ": " + product.getProductName() + ", " + product.getSalesPrice());
		}*/
		
		// SQL'DEN VERİ OKUMA
		List<Product> productList = productDao.selectAll();

	    for (Product product : productList) {
	        System.out.println(product.getId() + " - " +"Ürün ismi: "+ product.getProductName() + "- Ürün Fiyatı: "+ product.getSalesPrice());
	    }
    	
    	
    	
    	// Ürün bulma
    	Product product = productDao.findById(1); // 1 yerine aradığınız ürünün id'sini yazabilirsiniz
    	if (product != null) {
    	    System.out.println("Product found: " + product.getProductName());
    	} else {
    	    System.out.println("Product not found!");
    	}
    	
    	connection.close();
	}

}
