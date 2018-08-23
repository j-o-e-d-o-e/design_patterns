package visitor_basic;

public class Client {
    public static void main(String[] args){
        Car car = new Car();
        car.accept(new CheckVisitor());
        car.accept(new RepairVisitor());

    }
}
