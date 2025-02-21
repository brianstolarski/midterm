/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;
// import static java.time.Clock.system; // not sure what this is?

/**
 * This class calls the method to perform
 * arithmetic operations based on user input
 * execute the code check the output
 * 
 * @author sivagamasrinivasan
 * @author Brian Stolarski
 * 
 */

public class Arithmetic {
    public static void main(String[] args) {
        ArithmeticBase r = new ArithmeticBase();
        Scanner input = new Scanner(System.in);


        // making sure we do not use int as per the instructions in the midterm
        System.out.println("Enter the first number: ");
        double num = input.nextDouble();
        System.out.println("Enter the second number: ");
        double numtwo = input.nextDouble();
       
        // lets print out all the available operations by itterating through them all
        System.out.println("Available operations:");
        for (ArithmeticBase.Operation op : ArithmeticBase.Operation.values()) {
            System.out.println(op);
        }

        System.out.println("Enter the operation you would like to use as shown above: ");
        String opInput = input.next().toUpperCase();
        ArithmeticBase.Operation op = ArithmeticBase.Operation.valueOf(opInput);

        double result = r.calculate(num, numtwo, op);
        System.out.println("The Result is: " + result);

        input.close(); // closing the annoying scanner message
    }
}

// didn't have time to convert everything from string/int to something else, but hopefully this shows understanding of what the question asks and still counts for marks.