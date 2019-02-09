package shop;

abstract class Human {
    String name;
    String nick;
    String password;
    String adress;
    String numberTelephone;

    public static void main(String[] args) {
        Client lol = new Client("Пятёрачка", "DarkMan", "12345", "Street kylon", "098342323");
    }

    public Human(String name, String nick, String password, String adress, String numberTelephone) {
        this.name = name;
        this.nick = nick;
        this.password = password;
        this.adress = adress;
        this.numberTelephone = numberTelephone;
    }
}
