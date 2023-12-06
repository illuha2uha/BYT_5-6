package Builder;

class Pepperoni implements PizzaBuilder{
    private final Pizza pizza = new Pizza();

    @Override
    public void buildDough() {
        pizza.setDough("thick");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("spicy tomato");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni and mozzarella cheese");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
