package class6;

import java.util.Scanner;

public class E13DoWhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;
        do {
            System.out.println("Please a number or -1 to 10 terminate");
            input =scanner.nextInt();
            System.out.println("You have entered! " +input);
        }while (input!=-1);
    }
}
