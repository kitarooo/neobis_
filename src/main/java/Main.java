import week2.connection.Connect;
import week2.dao.ClientsDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static week2.connection.Connect.connection;

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
    }
}
