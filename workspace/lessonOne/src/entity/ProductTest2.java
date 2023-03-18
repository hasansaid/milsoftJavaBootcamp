package entity;

public class ProductTest2 {
    public static void main(String[] args) {
        Product product = new Product(301,"Cep Telefonu",3450.0);
        System.out.println("Ürünün Özdeşliği : " +product.getProductId());
        System.out.println("Ürünün Adı : "+ product.getProductName());
        System.out.println("Satış Ederi : " + product.getSalesPrice());

    }
}
