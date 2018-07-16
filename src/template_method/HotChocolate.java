package template_method;

class HotChocolate extends HotDrink {
    @Override
    void boilFluid() {
        System.out.println("Boiling milk");
    }

    @Override
    void addIngredients() {
        System.out.println("Adding Cocoa powder");
    }

    @Override
    void serve() {
        super.serve();
        System.out.println("cup of hot chocolate");
    }
}