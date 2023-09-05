package class5;

import java.util.Scanner;

public class E4SwitchReview {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the name of the fruit?");
            String fruit = scanner.nextLine();

            switch (fruit) {
                case "Orange":
                    System.out.println("It is usually orange");
                    break;
                case "Banana":
                    System.out.println("Yellow Bananas are good");
                    break;
                case "Strawberry":
                    System.out.println("Strawberry is berry good");
                    break;
                case "Blueberry":
                    System.out.println("Berry good!");
                    break;
                default:
                    System.out.println("I don't like fruit! ");
            }
        }
    }
}