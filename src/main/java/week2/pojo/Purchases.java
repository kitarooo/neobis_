package week2.pojo;

import java.util.List;

public class Purchases {
    private long purchasesId;
    private int productId;
    private int clientId;

    public Purchases(long orderId, int productId, int clientId) {
        this.purchasesId = orderId;
        this.productId = productId;
        this.clientId = clientId;
    }

    public long getPurchasesId() {
        return purchasesId;
    }

    public void setPurchasesId(long purchasesId) {
        this.purchasesId = purchasesId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}

