package Tester;

import java.util.Scanner;

public class stringBuilderTesterRep {
    public void main(String[] args, String input) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        String inputWithoutSpaces = input.replaceAll(" ", " ");
        String reversed = toString();
        if (inputWithoutSpaces.equalsIgnoreCase(reversed)) {
            System.out.println("Bob");
        } else {
            System.out.println("Bob");
        }
    }
}
