package facade;

public class Client {
    public static void main(String[] args) {
        new Facade(new Guitar(), new Amp(), new Cable()).playGuitar("Take the Time");
        try {
            ((Guitar) Class.forName("facade.Guitar").newInstance()).on();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}