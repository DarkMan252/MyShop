package shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Shop {

    public static void main(String[] args) {
        Shop marin = new Shop("Мерин");
        marin.registration("Максим", "MrDar4ik", "12345", "Governer Street 21", "0983055980");
        marin.registration("Максим33", "MrDar4ik", "12345", "Governer Street 21", "0983055980");
        System.out.println(marin.login("MrDar4ik", "12345"));
        marin.addProduct(new Product("Сметана", 21, "Maxim", TypeProduct.MILK, LocalDate.now(), 14), 100);
        marin.addProduct(new Product("Сметана", 23, "Maxim", TypeProduct.MILK, LocalDate.now(), 14), 50);
        Map<String, Integer> lol = new TreeMap<>();
        lol.put("One", 5);
        lol.put("One", 11);
        System.out.println(lol);
        System.out.println(marin.getListProduct());
        System.out.println(marin.quantityOffProduct("Сметана", "Maxim", 21));
        System.out.println(marin.quantityOffProduct("Сметана", "Maxim33", 23));
        marin.removeProduct(marin.findProduct("Сметана", "Maxim", 21), 5);
    }

    private Product findProduct(String name, String maker, int price) {
        Product result=null;
        for (Product temp : listProduct.keySet()) {
            if (temp.name.equals(name)) {
                if (temp.maker.equals(maker)) {
                    if (temp.price == price) {
                        result = temp;
                    }
                }
            }

        }
     return  result;
    }


    String name;
    private Map<Product, Integer> listProduct = new TreeMap<>();
    private ArrayList<Client> listClient = new ArrayList<>();
    private ArrayList<Order> listOrder = new ArrayList<>();

    public Shop(String name) {
        this.name = name;
    }

    public ArrayList<Client> getListClient() {
        return listClient;
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public Map<Product, Integer> getListProduct() {
        return listProduct;
    }


    public void addProduct(Product par, int count) {
        Integer oldCount = listProduct.get(par);
        if (oldCount == null) {
            listProduct.put(par, count);
        } else {
            listProduct.put(par, oldCount + count);
        }

    }

    public void removeProduct(Product par, int count) {
        if (quantityOffProduct(par) == 0 | quantityOffProduct(par) < count) {
            System.out.println("Проблема с количевством данного продукта.");
        } else {
            listProduct.put(par, quantityOffProduct(par) - count);
        }
    }

    private int quantityOffProduct(String name, String maker, int price) {
        int result = 0;
        for (Product temp : listProduct.keySet()) {
            if (temp.name.equals(name)) {
                if (temp.maker.equals(maker)) {
                    if (temp.price == price) {
                        result = listProduct.get(temp);
                    }
                }
            }
        }
        return result;
    }

    public int quantityOffProduct(Product par) {
        return listProduct.get(par) == null ? 0 : listProduct.get(par);
    }

    public boolean registration(String name, String nick, String password, String adress, String numberTelephone) {
        if (listClient.stream().filter(w -> w.nick.equals(nick)).count() != 0) {
            System.out.println("Пользователь с таким ником уже есть!");
            return false;
        } else {
            Client temp = new Client(name, nick, password, adress, numberTelephone);
            listClient.add(temp);
        }
        return true;
    }

    public Client login(String nick, String password) {
        Client result = null;
        for (Client temp : listClient) {
            if (temp.nick.equals(nick) & temp.password.equals(password)) {
                result = temp;
            }
        }
        return result;
    }

}
