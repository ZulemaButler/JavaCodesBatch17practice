package class12;

import java.util.Scanner;

public class Calculator {
    void add(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Please the second number");
        int num2= scanner.nextInt();
        int sum=num1+num2;
        System.out.println("sum of these number is "+sum);
    }

    void subtract(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1=scanner.nextInt();
        System.out.println("Please the second number");
        int num2= scanner.nextInt();
        int sum=num1-num2;
        System.out.println("sum of these number is "+sum);


    }

    void multiply(int number1, int number2)
    {
/*    int number1=10;
      int number2=20
 */
        int result=number1*number2;
        System.out.println(result);
    }


}