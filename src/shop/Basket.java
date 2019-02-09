package shop;

import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private Map<Product, Integer> basket = new TreeMap<>();

    public Map<Product, Integer> getBasket() {
        return basket;
    }

    public boolean addBasket(Product par, int count, Shop par2) {
        boolean result = true;
        int quantity = par2.quantityOffProduct(par);
        if (quantity == 0 || count > quantity) {
            System.out.println("Товар отсуствует на складе!");
            return false;
        } else {
            if (basket.get(par) == null) {
                basket.put(par, count);
            } else {
                basket.put(par, basket.get(par) + count);
            }
        }
        return result;
    }

    public void removeBasket(Product par, int count, Shop par2) {
        int tempCount = basket.get(par);
        if (tempCount >= count) {
            basket.put(par, basket.get(par) - count);
        } else {
            System.out.println("Warrning !");

        }

    }
}
