package Calculator;

public class Main {
    public static void main(String[] args) {
        Addition add = new Addition();
        Multiplication multiply = new Multiplication();
        Subtraction subtract = new Subtraction();
        Division divide = new Division();

        add.setNext(multiply);
        multiply.setNext(subtract);
        subtract.setNext(divide);

        Request a = new Request("add", 10, 13.7);
        Request b = new Request("divide", 15.6, 2.8);
        Request c = new Request("multiply", 1003, 0.6);
        Request d = new Request("subtract", 3, 7.777);

        System.out.printf("%f + %f = %f\n", a.getA(), a.getB(), add.handle(a));
        System.out.printf("%f / %f = %f\n", b.getA(), b.getB(), add.handle(b));
        System.out.printf("%f * %f = %f\n", c.getA(), c.getB(), add.handle(c));
        System.out.printf("%f - %f = %f\n", d.getA(), d.getB(), add.handle(d));


    }
}
