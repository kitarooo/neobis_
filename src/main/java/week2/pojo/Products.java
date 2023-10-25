package week2.pojo;

public class Products {
    private long productId;
    private String name;
    private int price;

    public Products() {
    }

    public Products(String name, int price, long productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
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
