package template_method;

abstract class HotDrink {

    void prepareHotDrink() {
        boilFluid();
        addIngredients();
        serve();
    }

    abstract void boilFluid();

    abstract void addIngredients();

    void serve() {
        System.out.print("Serving ");
    }
}