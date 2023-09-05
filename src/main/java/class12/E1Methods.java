package class12;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {
        //we are creating the object of Scanner class
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please enter your name");

        //using the scanner object we are calling the nextInt Method.
        String name=scanner.nextLine();

        //scanner.nextLine();
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("Your name is "+name+" and your are "+ age+" years old");

        if (age<18){
            System.out.println("You are not allowed to vote");
        }

    }

    void takeUserInput(){

    }
}
