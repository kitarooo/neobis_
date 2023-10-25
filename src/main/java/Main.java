import week2.connection.Connect;
import week2.dao.ClientsDAO;
import week2.dao.ProductsDAO;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        ClientsDAO clientsDAO = new ClientsDAO();
        Connection connection = Connect.connection();
        //add new client
        //clientsDAO.insertClient(connection, 1, "Jack");

        //update client_name
        //clientsDAO.updateClientById(connection,1,"Joel");

        //delete client by id
        //clientsDAO.deleteClientById(connection,1);

        //SELECT * FROM clients
        //clientsDAO.checkAllClient(connection);




        ProductsDAO productsDAO = new ProductsDAO();
        //add new product
        //productsDAO.insertProduct(connection,1,"cola", 500);

        //update product by id
        //productsDAO.updateProductById(connection,1,"cola",550);

        //delete prodct by id
        //productsDAO.deleteProductById(connection,1);

        //check all products
        //productsDAO.checkAllProducts(connection);
    }
}
