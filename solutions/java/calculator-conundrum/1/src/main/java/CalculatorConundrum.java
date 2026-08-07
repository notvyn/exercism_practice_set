class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            int result = 0;
    
            if (operation == null) {
                throw new IllegalArgumentException("Operation cannot be null");
            } else if (operation.isEmpty()) {
                throw new IllegalArgumentException("Operation cannot be empty");
            } else if (operation == "/" && operand2 == 0) {
                throw new ArithmeticException();
            }
    
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
    
            String expression = Integer.toString(operand1) + " " + operation + " " + Integer.toString(operand2) + " = " + Integer.toString(result);  
    
            return expression;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
