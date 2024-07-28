package application;

import entities.Product;
import util.ProductConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Fazer um programa que, a partir de uma lista de produtos, aumente o
//        preço dos produtos em 10%.

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(Product::nonStaticPriceUpdate);

        list.forEach(System.out::println);
    }
}