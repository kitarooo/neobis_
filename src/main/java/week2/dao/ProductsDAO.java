package week2.dao;

import week2.pojo.Products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductsDAO {
    public void addProduct(Connection connection, int productId, String productName, int productPrice) {
        String insertSQL = "INSERT INTO products (product_id, product_name, product_price) VALUES (?, ?, ?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            preparedStatement.setInt(1, productId);
            preparedStatement.setString(2, productName);
            preparedStatement.setInt(3, productPrice);

            preparedStatement.executeUpdate();
            System.out.println("Успешно добавили продукт в таблицу");
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public void updateProductById(Connection connection, int productId, String newProductName, int newProductPrice) {
        String updateSQL = "UPDATE products SET product_name = ?, product_price = ? WHERE product_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);

            preparedStatement.setString(1, newProductName);
            preparedStatement.setInt(2, newProductPrice);
            preparedStatement.setInt(3, productId);

            int rowsUpdate = preparedStatement.executeUpdate();

            if (rowsUpdate > 0) {
                System.out.println("Данные продукта id: " + productId + " были успешно обновлены");
            } else {
                System.out.println("Не удалось обновить продукт с id: " + productId);
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public void deleteProductById(Connection connection, int productId) {
        String deleteSQL = "DELETE FROM products WHERE product_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, productId);

            preparedStatement.executeUpdate();
            System.out.println("Данный продукт с id: " + productId + " был успешно удален");
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public List<Products> selectAllProducts(Connection connection) {
        String checkAllProducts = "SELECT * FROM products";
        List<Products> products = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(checkAllProducts);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Products product = new Products();

                product.setProductId(resultSet.getLong("product_id"));
                product.setName(resultSet.getString("product_name"));
                product.setPrice(resultSet.getInt("product_price"));

                products.add(product);

                System.out.println("Product id: " + product.getProductId() + ", product name: " + product.getName() + ", product price: " + product.getPrice());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return products;
    }
}
