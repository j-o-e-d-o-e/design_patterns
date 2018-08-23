package facade;

class Cable {
    void connectTo(Object o) {
        System.out.println("Cable connected to " + o.getClass().getSimpleName());
    }
}