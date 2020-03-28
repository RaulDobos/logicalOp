package org.logicalOp;

public class LogicalOp {

    public void countFromThisNumberUpTo100(int number){
        System.out.println("The numbers from your given number up to 100 are: ");

        for (; number <= 100; number++){
                System.out.println(number);
        }
    }

    public void countFromThisNumberDownToNegative100(int number){
        System.out.println("The numbers from your given number down to -100 are: ");

        for (; number >= -100; number--){
                System.out.println(number);
        }
    }

    public void CountFromXtoY(int x, int y){
        while(x <= y){
            System.out.println(x);
            x++;
        }
    }

    public void compareAndCountFromSmallestToBiggest(int x, int y){
        if(x < y){
            System.out.println(y + " is bigger than " + x + ". The numbers from " + x + " to " + y + " are: ");
            for(; x <= y; x++){
                System.out.println(x);
            }
        }
        else if(x > y) {
            System.out.println(x + " is bigger than " + y + ". The numbers from " + y + " to " + x + " are: ");
            for (; y <= x; y++) {
                System.out.println(y);
                }
            }
            else{
                System.out.println(x + " and " + y + " are equal.");
            }
    }

    public void printEvenNumbersFrom1to100(){
        System.out.println("All even numbers from 1 to 100 are: ");
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public void printOddNumbersFrom1to100(){
        System.out.println("All odd numbers from 1 to 100 are: ");
        for(int i = 1; i <= 100; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    public int addAllNumbersUpTo100(int number){
        int sum = 0;
        for(; number <= 100; number++){
            sum += number;
        }
        return sum;
    }

    public double calculateAverageOfNumbersUpTo100(int number){
        return (double)addAllNumbersUpTo100(number) / (100 - number + 1);
    }

    public void printAsteriskPyramid(){
        for(int i = 10; i > 0 ; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
