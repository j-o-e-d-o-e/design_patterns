package strategy;

class Cat extends Animal { // context class

    Cat(String name, RunningBehavior running) {
        this.name = name;
        this.runningBehavior = running;
    }
}
