package class5;

import java.util.Scanner;

public class Task2AndOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Please enter your height");//Use scanner whenever you're prompting for a question
        double height = scanner.nextDouble();
        //to enter a person height in inches--use "Double, etc" when using NEXT()

        if (height < 60) {
            System.out.println("Tiny");
        } else if (height>=60 && height<=72) {
           System.out.println("Almost there");
        }else{
            System.out.println("You're a GIANT!");

        }

    }
}
