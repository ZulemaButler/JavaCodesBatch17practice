package class12;

import java.util.Scanner;

public class E1MethodPartDos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please enter your age");
        int age= scanner.nextInt();
        System.out.println("Your name is "+name+" and your are "+ age+" years old");
    }
}
