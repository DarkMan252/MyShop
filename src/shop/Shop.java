package shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Shop {
    String name;
    private Map<Product, Integer> listProduct = new TreeMap<>();
    private ArrayList<Client> listClient = new ArrayList<>();
    private ArrayList<Order> listOrder = new ArrayList<>();

    public ArrayList<Client> getListClient() {
        return listClient;
    }

    public ArrayList<Order> getListOrder() {
        return listOrder;
    }

    public void addProduct(Product par, int count) {

    }

    public int findProduct(Product par) {
        return listProduct.get(par) == null ? 0 : listProduct.get(par);
    }

    public boolean regastetion(String name, String nick, String password, String adress, String numberTelephone) {
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
            if (temp.nick.equals(nick) & temp.password.equals(password)){
                result=temp;
            }
        }
        return result;
    }
}
