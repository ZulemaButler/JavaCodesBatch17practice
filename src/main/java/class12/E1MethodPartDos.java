package class12;

import java.util.Scanner;

public class E1MethodPartDos {
    public static void main(String[] args) {

        takeUserInput(); //the logic is already written inside this method

    }

static void takeUserInput(){ //This is the logic
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter your name");
    String name=scanner.nextLine();
    System.out.println("Please enter your age");
    int age= scanner.nextInt();
    System.out.println("Your name is "+name+" and your are "+ age+" years old");
    }
}