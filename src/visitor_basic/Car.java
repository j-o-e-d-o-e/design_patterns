package visitor_basic;

class Car {
    private Engine engine = new Engine();
    private Body body = new Body();
    private Wheel[] wheels = {new Wheel("front left"), new Wheel("front right"), new Wheel("back left"), new Wheel("back right")};

    void accept(Visitor visitor) {
        if (visitor instanceof CheckVisitor) {
            visitor.visit(this);
            engine.accept(visitor);
            body.accept(visitor);
            for (Wheel wheel : wheels)
                wheel.accept(visitor);
        } else{
            body.accept(visitor);
            wheels[0].accept(visitor);
            wheels[1].accept(visitor);
        }
    }
}
