package strategy;

public class RunningSlow implements RunningBehavior { // strategy class

    @Override
    public void run(Animal animal) {
        System.out.println(animal.getName() + " running slow");
    }
}