package writtinghomework3;

import java.util.Scanner;

public class Programme_1OddEvenTernaryOperator {
    /**
     * 1. write a java program that tells us that Input number is odd or even?
     * HINT: use ternary operator(? :)
     *
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //closing the scanner object
        scanner.close();

    }
    //Checking the number is even or odd
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 == 0) ? "Even" : "odd";
        System.out.println("The" + number+ "is " + evenOrOdd + " numbe");
    }
}
