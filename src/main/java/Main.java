import week2.dao.UserDAO;
import week2.dao.ProductsDAO;

public class Main {
    public static void main(String[] args) {
        //CRUD with table - clients
        UserDAO userDAO = new UserDAO();
        //add new user
        //userDAO.addUser("user", "Joel","McCall","adfasadf@.mail.ru", "87770983092", "qwerty");

        //update client_name
        //userDAO.updateUserById(2,"James","Stilinckiy","244242@mail.ru", "87082980762", "ytrewq");

        //SELECT * FROM clients
        //userDAO.selectAllClient();

        //delete client by id
        userDAO.deleteUserById(6);
        userDAO.deleteUserById(7);
        userDAO.deleteUserById(9);
        userDAO.deleteUserById(10);
        userDAO.deleteUserById(11);
        userDAO.deleteUserById(12);


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
