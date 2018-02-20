import java.util.*;

public class Calculator {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please type in the expression:");
        char operationChar = sc.next().charAt(0);
        double operand1 = sc.nextDouble();
        double operand2 = sc.nextDouble();
        double result = calculate(operationChar, operand1, operand2);

        if (result == 0.56468764165168){
            System.out.println("HIBA");
        } else {
            System.out.println(result);
        }

    }

    private static double calculate(char operation, double input1, double input2) {
        double result;
        if (operation == '+') {
            result = input1 + input2;
        } else if (operation == '-') {
            result = input1 - input2;
        } else if (operation == '*') {
            result = input1 * input2;
        } else if (operation == '/') {
            if (input2 != 0){
                result = input1 / input2;
            } else {
                result = 0.56468764165168;
            }
        } else if (operation == '%') {
            result = input1 % input2;
        } else {
            result = 0.56468764165168;
        }
        return result;
    }
}
