package visitor_basic;

public class RepairVisitor implements Visitor {
    @Override
    public void visit(Car car) {
        System.out.println("Repairing car.");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Repairing engine.");
    }

    @Override
    public void visit(Body body) {
        System.out.println("Repairing body.");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Repairing " + wheel.getName() + " wheel.");
    }
}
