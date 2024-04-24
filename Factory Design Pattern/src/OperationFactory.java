public class OperationFactory {
    public Operation getInstance(String type) {
        if(type == null) return null;
        if(type.equalsIgnoreCase("Sum")) {
            return new Sum();
        }
        else if(type.equalsIgnoreCase("SUb")) {
            return new Sub();
        }
        else if(type.equalsIgnoreCase("Mul")) {
            return new Mul();
        }
        else if(type.equalsIgnoreCase("Div")) {
            return new Div();
        }
        return null;
    }
}
