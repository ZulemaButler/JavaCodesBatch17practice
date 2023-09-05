package Review2;

import java.util.Scanner;

public class E8CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("What city are you in");
        String city=scanner.nextLine();

        System.out.println("What is the temperature in city in fahrenheit?");
        double fahrenheit=scanner.nextDouble();
        double celsius=(fahrenheit-32)*5/9;

    }
}
