package work.dataAccess;

import java.sql.Connection;
import java.util.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import work.entities.Product;

public class ProductDao {
    private Connection connection;
    
    public ProductDao(Connection connection) {
        this.connection = connection;
    }

    public void insert(Product product) throws SQLException {
    	String sql ="insert into \"Product\"(\"productName\",\"salesPrice\") values(?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, product.getProductName());
        statement.setDouble(2, product.getSalesPrice());
        statement.executeUpdate();
    }
    public List<Product> selectAll() throws SQLException {
        String sql = "SELECT * FROM \"Product\"";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        List<Product> productList = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("productId");
            String productName = resultSet.getString("productName");
            Product product = new Product();
            product.setId(id);
            product.setProductName(productName);
            productList.add(product);
        }
        return productList;
 }
    
    public void deleteProduct(int id) {
        String deleteQuery = "DELETE FROM \"Product\" WHERE \"productId\" = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
            preparedStatement.setInt(1, id);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " Veri silindi!");
            } else {
                System.out.println("Silinemedi!");
            }
        } catch (SQLException e) {
            System.out.println("HATA: " + e.getMessage());
        }
    }
    
    public void update(Product product) throws SQLException {
        String updateQuery = "UPDATE \"Product\" SET \"productName\" = ?, \"salesPrice\" = ? WHERE \"productId\" = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
            preparedStatement.setString(1, product.getProductName());
            preparedStatement.setDouble(2, product.getSalesPrice());
            preparedStatement.setInt(3, product.getId());
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println(rowsAffected + " Veri güncellendi!");
            } else {
                System.out.println("Güncellenemedi!");
            }
        } catch (SQLException e) {
            System.out.println("HATA: " + e.getMessage());
            throw e;
        }
    }
    
    
    public Product findById(int id) throws SQLException {
        String selectQuery = "SELECT * FROM \"Product\" WHERE \"productId\" = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int productId = resultSet.getInt("productId");
                    String productName = resultSet.getString("productName");
                    Double price = resultSet.getDouble("salesPrice");
                    return new Product(productId, productName, price);
                } else {
                    System.out.println("Ürün bulunamadı!");
                    return null;
                }
            }
        } catch (SQLException e) {
            System.out.println("HATA: " + e.getMessage());
            throw e;
        }
    }


}