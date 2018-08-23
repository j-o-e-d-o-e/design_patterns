package visitor_basic;

public class CheckVisitor implements Visitor {
    @Override
    public void visit(Engine engine) {
        System.out.println("Checking " + engine.getClass().getSimpleName());
    }

    @Override
    public void visit(Body body) {
        System.out.println("Checking " + body.getClass().getSimpleName());
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Checking " + wheel.getName() + " wheel");
    }
}
