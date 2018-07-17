package strategy;

class Dog extends Animal { // context class

    Dog(String name, RunningBehavior running) {
        this.name = name;
        this.runningBehavior = running;
    }
}