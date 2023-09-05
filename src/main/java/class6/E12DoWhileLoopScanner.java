package class6;

import java.util.Scanner;

public class E12DoWhileLoopScanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name or shutdown to close the program");
        String input;

        do{
            input= scanner.nextLine();
            System.out.println("You are great " + input);
        }while (!input.equalsIgnoreCase("shutdown"));

    }
}
