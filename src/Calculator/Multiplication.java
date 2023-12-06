package Calculator;

public class Multiplication extends OperationHandler{
    @Override
    public double handle(Request request) {
        if ("multiply".equals(request.getOperation())) {
            return request.getA() * request.getB();
        } else {
            return super.handle(request);
        }
    }
}
