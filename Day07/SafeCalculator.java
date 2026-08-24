package Day07;


public class SafeCalculator {

    public static void main(String[] args) {
        while(true) {

            try {
                System.out.println("\nEnter first operand: ");
                double firstOperand = TextIO.getDouble();
                System.out.println("Enter second operand: ");
                double secondOperand = TextIO.getDouble();
                
                System.out.println("\nEnter operator (+ - * / %): ");
                char operator = TextIO.getChar();
                
                switch(operator) {
                    case '+': 
                        System.out.println("\nAdd: " + (firstOperand + secondOperand));
                        break;
                    case '-' :
                        System.out.println("\nSubract: " + (firstOperand - secondOperand));
                        break;
                
                    case '*':
                        System.out.println("\nproduct: " + (firstOperand * secondOperand));
                        break;
                
                    case '/':
                        try { 
                            if (secondOperand == 0 )
                            throw new IllegalArgumentException("\nCannot Divide by Zero");
                        System.out.println("\nDivision: " + (firstOperand / secondOperand));
                        }
                        catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;

                    case '%':   
                        try { 
                            if (secondOperand == 0 )
                            throw new IllegalArgumentException("\nCannot Divide by Zero");
                        System.out.println("\nReminder: " + (firstOperand % secondOperand));
                        }
                        catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    
                    default :
                        System.out.println("Invalid Operator");
                        break;
                }
            }

            catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
            
            finally {
                System.out.println("\nCalculation Attempt Completed");
            }
        }

    }
    
}
