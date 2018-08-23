package visitor_basic;

class Body {
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
