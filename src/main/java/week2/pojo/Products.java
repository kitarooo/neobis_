package week2.pojo;

public class Products {
    private String name;
    private int price;
    private long productId;

    public Products(String name, int price, long productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
