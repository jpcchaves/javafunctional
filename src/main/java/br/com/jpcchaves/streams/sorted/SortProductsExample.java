package br.com.jpcchaves.streams.sorted;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortProductsExample {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product("TV", new BigDecimal("2222.22")),
                new Product("Notebook", new BigDecimal("1777.77")),
                new Product("Macbook", new BigDecimal("4444.44")),
                new Product("Mouse", new BigDecimal("100.00"))
        );

        List<Product> productAscendingByPrice = products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .toList();

        System.out.println(productAscendingByPrice);

        List<Product> productDescendingByPrice = products.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();

        System.out.println(productDescendingByPrice);
    }

    public static class Product {
        private String name;
        private BigDecimal price;

        public Product() {
        }

        public Product(String name, BigDecimal price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
