package writtinghomework3;

import java.util.Scanner;

/**
 * write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class Programme_2_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year :");
        int year =scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        //closing scanner
        scanner.close();

    }
    // Checking is it leap year ot not
    public void isItLeapYear(int year){
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
            System.out.println("The year " + year + "is leap year");
            return;
        }
        System.out.println("The year " + year + "Is not a leap year");
    }
}
