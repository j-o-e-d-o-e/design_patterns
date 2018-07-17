package strategy;

public class RunningFast implements RunningBehavior { // strategy class

    @Override
    public void run(Animal animal) {
        System.out.println(animal.getName() + " running fast");
    }
}