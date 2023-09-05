package Review2;

import java.util.Scanner;

public class E9CommonScannerIssue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter full name");
        String fullName=scanner.nextLine();
        System.out.println("Please enter your city?");
        //scanner.nextLine(); // to consume the enter press
        String city=scanner.nextLine();
        System.out.println(fullName+ " "+city);
    }
}
