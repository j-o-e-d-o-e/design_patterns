package facade;

class Cable {
    void connectTo(Guitar guitar) {
        System.out.println("Cable connected to guitar");
    }

    void connectTo(Amp amp) {
        System.out.println("Cable connected to amp");
    }
}