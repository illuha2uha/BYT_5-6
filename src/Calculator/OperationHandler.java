package Calculator;

public class OperationHandler {
    private OperationHandler next;

    public OperationHandler() {
        this.next = null;
    }

    public void setNext(OperationHandler next) {
        this.next = next;
    }

    public double handle(Request request){
        if (next != null) {
            return next.handle(request);
        }
        return 0;
    }
}
