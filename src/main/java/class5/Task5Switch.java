package class5;

import java.util.Scanner;

public class Task5Switch {
    public static void main(String[] args) {
        System.out.println("Enter your country");
        Scanner scanner=new Scanner(System.in);
        String country=scanner.nextLine();

        switch (country){
            case "brazil":

                System.out.println("portuguese");
                break;

            case "mexico":
                System.out.println("spanish");
                break;

                case "india":
                System.out.println("hindi");

               case "santo domingo":
                System.out.println("spanish");
              break;
            default:
                System.out.println("your lingo is not supported");


        }
    }
}
