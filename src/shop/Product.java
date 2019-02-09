package shop;

import java.time.LocalDate;

public class Product {
    String name;
    int price;
    String maker;
    TypeProduct type;
    LocalDate StartShelfLife;
    int StopShelfLife;

    public Product(String name, int price, String maker, TypeProduct type, LocalDate startShelfLife, int stopShelfLife) {
        this.name = name;
        this.price = price;
        this.maker = maker;
        this.type = type;
        StartShelfLife = startShelfLife;
        StopShelfLife = stopShelfLife;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", maker='" + maker + '\'' +
                ", type=" + type +
                ", StartShelfLife=" + StartShelfLife +
                ", StopShelfLife=" + StopShelfLife +
                '}';
    }
}
