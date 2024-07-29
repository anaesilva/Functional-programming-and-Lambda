package model.entities;

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

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
