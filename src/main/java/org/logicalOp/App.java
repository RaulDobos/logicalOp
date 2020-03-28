package org.logicalOp;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        LogicalOp logicalOp = new LogicalOp();





        /**
         * exercise to print numbers from given number up to 100 and down to -100
         *
         *
         */

        System.out.println("Insert a number lower than 100 and bigger than -100: ");
        int number = scanner.nextInt();

        while(number >= 100 || number <= -100){
            System.out.println("The number you inserted is bigger or equal to 100, or lower or equal to -100, insert a new one: ");
            number = scanner.nextInt();
        }

        logicalOp.countFromThisNumberUpTo100(number);
        logicalOp.countFromThisNumberDownToNegative100(number);








        /**
         * exercise to print numbers from x to y
         *
         *
         */

        System.out.println("Insert a value for x:");
        int firstNumber = scanner.nextInt();

        System.out.println("Insert a value for y: ");
        int secondNumber = scanner.nextInt();

        System.out.println("Numbers from " + firstNumber + " to " + secondNumber + " are: ");
        logicalOp.CountFromXtoY(firstNumber, secondNumber);






        /**
         * exercise to compare x and y and print numbers between
         * them in ascending order
         *
         */

        System.out.println("Insert a value for x:");
        firstNumber = scanner.nextInt();

        System.out.println("Insert a value for y: ");
        secondNumber = scanner.nextInt();

        logicalOp.compareAndCountFromSmallestToBiggest(firstNumber, secondNumber);







        /**
         * exercise to print even and odd numbers from 1 to 100
         *
         */

        logicalOp.printEvenNumbersFrom1to100();
        logicalOp.printOddNumbersFrom1to100();






        /**
         * exercise to sum all numbers from a given number to 100
         *
         */

        System.out.println("Insert a number: ");
         number = scanner.nextInt();

        System.out.println("The sum of all numbers from " + number + " to 100 is " + logicalOp.addAllNumbersUpTo100(number) + ".");





        /**
         * exercise to calculate average of all numbers
         * from given number up to 100
         *
         */

        System.out.println("Insert a number: ");
        number = scanner.nextInt();

        System.out.println("The average of all numbers from " + number + " to 100 is " + logicalOp.calculateAverageOfNumbersUpTo100(number) + ".");





        /**
         * exercise to print an asterisk pyramid
         *
         */

        logicalOp.printAsteriskPyramid();
    }
}
