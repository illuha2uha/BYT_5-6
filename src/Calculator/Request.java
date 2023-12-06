package Calculator;

public class Request {
    private final String operation;
    private final double a;
    private final double b;

    public Request(String operation, double a, double b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
    }

    public String getOperation() {
        return operation;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
