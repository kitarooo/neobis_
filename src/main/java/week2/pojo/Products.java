package week2.pojo;

import lombok.Data;

@Data
public class Products {
    private Long productId;
    private String name;
    private int price;

    public Products() {
    }
}
