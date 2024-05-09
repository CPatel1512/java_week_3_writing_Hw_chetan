package writtinghomework3;
/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */

public class Programme_10_DoOperationWithSymbol {

    // calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol){
        if (symbol == '+'){
            System.out.println(x + " + " + y + "=" + (x + y));
        }else if (symbol == '-'){
            System.out.println(x + "-" + y + "=" + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " X " + y + "="+ (x * y));
        } else if (symbol == '/') {
            System.out.println(x + "/" + y + "=" + (x / y));
        }else{
            System.out.println("Please enter correct symbol  +,-,*,/");
        }
    }
    }

