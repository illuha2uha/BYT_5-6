package Builder;

class PizzaConstructor {
    public void constructPizza(PizzaBuilder builder) {
        builder.buildDough();
        builder.buildSauce();
        builder.buildTopping();
    }
}
