/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;
//import java.util.Scanner; // don't need this since this class will only be used for calculations.

/**
 * This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * 
 * @author sivagamasrinivasan
 * @author Brian Stolarski
 * 
 */
public class ArithmeticBase {
    // lets put enum inside the class obviously
    public enum Operation {
        PLUS, 
        MINUS, 
        TIMES, 
        DIVIDE
    }

    // calculating the user inputs based on the operation they chose by using a switch case
    double calculate(double x, double y, Operation operation) {
        switch (operation) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new IllegalArgumentException("Invalid operation, please enter a valid operation!");
        }
    }
}
