package shop;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Order {
    String nomer;
    LocalDate start;
    Client owner;
    StateOrder state;
    Map<Product, Integer> basket = new TreeMap<>();

    public Order(String nomer, LocalDate start, Client owner, StateOrder state) {
        this.nomer = nomer;
        this.start = start;
        this.owner = owner;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "nomer='" + nomer + '\'' +
                ", start=" + start +
                ", owner=" + owner +
                ", state=" + state +
                ", basket=" + basket +
                '}';
    }

}
