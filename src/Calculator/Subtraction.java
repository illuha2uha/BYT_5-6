package Calculator;

public class Subtraction extends OperationHandler{
    @Override
    public double handle(Request request) {
        if ("subtract".equals(request.getOperation())) {
            return request.getA() - request.getB();
        } else {
            return super.handle(request);
        }
    }
}
