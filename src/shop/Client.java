package shop;

public class Client extends Human {


    public Client(String name, String nick, String password, String adress, String numberTelephone) {
        super(name, nick, password, adress, numberTelephone);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", adress='" + adress + '\'' +
                ", numberTelephone='" + numberTelephone + '\'' +
                '}';
    }

    public void createOrder(Basket par){

    }
}
