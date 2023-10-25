package week2.dao;

import week2.pojo.Clients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClientsDAO {
    public void addClient(Connection connection, int clientId, String clientName) {
        String insertSQL = "INSERT INTO clients (client_id, client_name) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);

            preparedStatement.setInt(1, clientId);
            preparedStatement.setString(2, clientName);

            preparedStatement.executeUpdate();
            System.out.println("Успешно добавили клиента в таблицу!");
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }
    }

    public void updateClientById(Connection connection, int clientId, String newClientName) {
        String updateSQL = "UPDATE clients SET client_name = ? WHERE client_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);

            preparedStatement.setString(1, newClientName);
            preparedStatement.setInt(2, clientId);

            int rowsUpdate = preparedStatement.executeUpdate();

            if (rowsUpdate > 0) {
                System.out.println("Данные клиента с id: " + clientId + ", были успешно обновлены");
            } else {
                System.out.println("Клиента с таким id: " + clientId + " не существует");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteClientById(Connection connection, int clientId) {
        String deleteSQL = "DELETE FROM clients WHERE client_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, clientId);
            preparedStatement.executeUpdate();

            System.out.println("Данные с id: " + clientId + " были успешно удалены");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Clients> selectAllClient(Connection connection) {
        String checkSQL = "SELECT * FROM clients";
        List<Clients> clients = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(checkSQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Clients client = new Clients();
                client.setClientId(resultSet.getInt("client_id"));
                client.setName(resultSet.getString("client_name"));

                clients.add(client);

                System.out.println("Client id: " + client.getClientId() + ", name: " + client.getName());
            }
        } catch (SQLException e) {
            System.out.println("Error");
            throw new RuntimeException(e);
        }

        return clients;
    }
}


















