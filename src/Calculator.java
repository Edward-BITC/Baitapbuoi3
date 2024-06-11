public class Calculator {
    
    public void CalculatorInteger(String operation,double number1,double number2) {
        double answer=0;
        
        switch (operation) {
            case "+":
                answer= number1 + number2;
                break;
            case "-":
                answer  = number1- number2;
                break;
            case "*":
                answer = number1 *number2;
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Error:");
                } else {
                    answer = number1/number2;
                }
                break;
            default:
                System.out.println("Error:");
                
        }
        
        System.out.println("Answer " + number1 + " " + operation + " " + number2 + " = " + answer );
    }
}
    
