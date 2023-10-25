import week2.connection.Connect;
import week2.dao.ClientsDAO;
import week2.dao.ProductsDAO;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = Connect.connection();
        //CRUD with table - clients
        ClientsDAO clientsDAO = new ClientsDAO();
        //add new client
        //clientsDAO.addClient(connection, 1, "James");

        //update client_name
        //clientsDAO.updateClientById(connection,1,"Joel");

        //SELECT * FROM clients
        //clientsDAO.selectAllClient(connection);

        //delete client by id
        //clientsDAO.deleteClientById(connection,1);


        //CRUD with table - products
        ProductsDAO productsDAO = new ProductsDAO();
        //add new product
        //productsDAO.addProduct(connection,1,"cola", 500);

        //update product by id
        //productsDAO.updateProductById(connection,1,"cola",550);

        //delete prodct by id
        //productsDAO.deleteProductById(connection,1);

        //check all products
        //productsDAO.selectAllProducts(connection);
    }
}
