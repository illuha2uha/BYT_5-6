package Calculator;

public class Division extends OperationHandler{
    @Override
    public double handle(Request request) {
        if ("divide".equals(request.getOperation())) {
            return request.getA() / request.getB();
        } else {
            return super.handle(request);
        }
    }
}
