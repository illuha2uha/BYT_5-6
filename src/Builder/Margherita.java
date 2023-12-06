package Builder;

class Margherita implements PizzaBuilder{
    private final Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("thin");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("mozzarella cheese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
