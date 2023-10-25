package week2.pojo;

import java.util.List;

public class Purchases {
    private long purchasesId;
    private List<Products> products;

    public Purchases(long orderId, List<Products> products) {
        this.purchasesId = orderId;
        this.products = products;
    }

    public long getOrderId() {
        return purchasesId;
    }

    public void setOrderId(long orderId) {
        this.purchasesId = orderId;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }
}

