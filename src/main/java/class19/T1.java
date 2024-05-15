package class19;
/*
Create a method to find the minimum of two numbers method will be passed two parameters and will return the
minimum number method should work with int and double data types
 */
public class T1 {
    public int min(int num1, int num2) {

        //return num1>num2?num1:num2; // a shorter Syntax version to write an "if" condition called ternary operator

        if (num1 < num2) {
            return num1;

        } else {
            return num2;
        }
    }

    public double min(double num1, double num2) {
        if (num1 > num2) {
            return num1;

        } else {
            return num2;
        }

    }
}
