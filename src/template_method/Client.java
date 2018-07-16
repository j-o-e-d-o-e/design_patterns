package template_method;

public class Client {
    public static void main(String[] args) {
        new Tea().prepareHotDrink();
        new HotChocolate().prepareHotDrink();
    }
}