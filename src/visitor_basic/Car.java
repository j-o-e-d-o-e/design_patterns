package visitor_basic;

class Car {
    private Engine engine = new Engine();
    private Body body = new Body();
    private Wheel[] wheels = {new Wheel("Front left"), new Wheel("Front right"), new Wheel("Back left"), new Wheel("Back right")};

    void accept(Visitor visitor) {
        if (visitor instanceof CheckVisitor) {
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
