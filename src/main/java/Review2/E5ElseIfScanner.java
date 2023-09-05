package Review2;

import java.util.Scanner;

public class E5ElseIfScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner((System.in));
        System.out.println("Please enter your age to calculate the discount");
        int age =scanner.nextInt();
        /*
        if age is greater than 60 offer 20% discount
        if age is greater than 50 offer is 15% discount
        if age is greater than 40 offer is 10% discount
        No discount
         */
        if (age > 60) {
            System.out.println("You get 20% discount");
        } else if (age > 50) {
            System.out.println("You get 15% discount");
        } else if (age > 40) {
            System.out.println("You get 10% discount");
        } else {
            System.out.println("You don't get a hook up");

        }

    }
}




