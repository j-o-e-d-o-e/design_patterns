package strategy;

public class Client {
    public static void main(String[] args) {
        new Cat("Rocky", new RunningSlow()).run();
        new Dog("Bobby", new RunningFast()).run();
    }
}