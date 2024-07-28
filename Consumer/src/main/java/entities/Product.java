package entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private String name;
    private Double price;

    public static void staticPriceUpdate(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
