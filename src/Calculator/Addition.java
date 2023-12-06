package Calculator;

public class Addition extends OperationHandler {
    @Override
    public double handle(Request request) {
        if ("add".equals(request.getOperation())) {
            return request.getA() + request.getB();
        } else {
            return super.handle(request);
        }
    }

}
