package facade;

public class Client {
    public static void main(String[] args) {
        new Facade(new Guitar(), new Amp(), new Cable()).playGuitar("Take the Time");
    }
}