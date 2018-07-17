package strategy;

public abstract class Animal { // abstract context class
    RunningBehavior runningBehavior;
    String name;

    void run() {
        runningBehavior.run(this);
    }

    public String getName() {
        return this.name;
    }
}