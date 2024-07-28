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

    public void nonStaticPriceUpdate() {
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
