package Review3;

import java.util.Scanner;

public class E5Switch {
    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {


            Scanner scanner = new Scanner((System.in));
            System.out.println("Please enter the name of the fruit");
            String fruit = scanner.nextLine();

            switch (fruit) {
                case "Orange":
                    System.out.println("It is usually an Orange");
                    break;

                case "Banana":
                    System.out.println(" Are usually Yellow Mellow");
                    break;

                case "Strawberry":
                    System.out.println(" Are my faves!");
                    break;

                case "Bluebeery":
                    System.out.println("Are delish! ");
                    break;

                default:
                    System.out.println("I'm a veggie lover! ");
            }

        }

    }
}