package Builder;

class Main {
    public static void main(String[] args) {
        PizzaConstructor constructor = new PizzaConstructor();

        PizzaBuilder margheritaBuilder = new Margherita();
        constructor.constructPizza(margheritaBuilder);
        Pizza margherita = margheritaBuilder.getPizza();

        System.out.println("Margherita Pizza: " + margherita);

        PizzaBuilder pepperoniPizza = new Pepperoni();
        constructor.constructPizza(pepperoniPizza);
        Pizza pepperoni = pepperoniPizza.getPizza();

        System.out.println("Pepperoni Pizza: " + pepperoni);

    }
}
