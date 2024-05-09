package writtinghomework3;

import java.util.Arrays;

/**
 * Write a Java program to sort a numeric array and a string array.
 */

public class Programme_17_SortArray {

    public static void main(String[] args) {
        //Numeric Array declaration
        int[] numArray = {
                1789, 2035, 1899, 2040, 1950, 2255, 7897, 1455, 787};
        //String Declaration
        String [] strArray = {
                "Alpha","Bravo", "Delta", "Hotel", "Mike", "Sierra", "Peter", "Kilo" };
        System.out.println("Actual Numeric Array was : " + Arrays.toString(numArray));
        //Sorting the array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is : "  + Arrays.toString(strArray));
        // Sorting the array
        Arrays.sort(strArray);
        System.out.println("Sorted String array is : " + Arrays.toString(strArray));
    }
}
