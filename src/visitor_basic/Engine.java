package visitor_basic;

class Engine {
    void accept(Visitor visitor) {
        visitor.visit(this); // parameter obj and invoker swapped
    }
}
