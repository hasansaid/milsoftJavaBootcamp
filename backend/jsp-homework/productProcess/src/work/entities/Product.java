package work.entities;

public class Product {
	
	private int id;
	private String productName;
	private double salesPrice;
	
    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String productName, double salesPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.salesPrice = salesPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
	}
}