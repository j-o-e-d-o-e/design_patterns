package visitor_basic;

class Wheel {
    private final String name;

    Wheel(String name) {
        this.name = name;
    }

    void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }
}
