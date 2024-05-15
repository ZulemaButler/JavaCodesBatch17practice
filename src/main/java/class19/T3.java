package class19;
/*
Create 1 class with private method that has 3 overload forms. Then call each overloaded method with specific
arguments and observe result
 */
public class T3 {
    private int min(int num1, int num2) {

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


    }}
