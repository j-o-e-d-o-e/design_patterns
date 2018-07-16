package template_method;

class Tea extends HotDrink {
    @Override
    void boilFluid() {
        System.out.println("Boiling water");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding Teabag");
    }

    @Override
    void serve() {
        super.serve();
        System.out.println(" cup of tea");
    }
}