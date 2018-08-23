package visitor_basic;

public class CheckVisitor implements Visitor {

    @Override
    public void visit(Car car) {
        System.out.println("Checking car.");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Checking engine.");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Checking body.");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Checking " + wheel.getName() + " wheel.");
    }
}
