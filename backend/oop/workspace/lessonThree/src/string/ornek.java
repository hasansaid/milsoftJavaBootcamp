package string;


class Product {}

class ProductConverter{
    public String format(Product product){
        return null;
    }

    public Product parse(String line){
        return null;
    }
}

public class ornek {
    public static void main(String[] args) {
        //nesne => string builder
        //string =>nesne split

        Product product = new Product();
        ProductConverter converter = new ProductConverter();
        String line = converter.format(product);
        Product product1 = converter.parse(line);
        System.out.println(product1);
        System.out.println(product1);
        System.out.println(product1);
    }
}
