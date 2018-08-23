package visitor_basic;

public interface Visitor {

    void visit(Engine engine);

    void visit(Body body);

    void visit(Wheel wheel);
}
