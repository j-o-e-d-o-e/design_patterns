package visitor_basic;

class Wheel {
    private final String name;

    Wheel(String name) {
        this.name = name;
    }

    void accept(Visitor visitor) {
        visitor.visit(this); // parameter obj and invoker swapped
    }

    public String getName() {
        return name;
    }
}
