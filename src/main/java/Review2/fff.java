package Review2;

import java.util.Scanner;

public class fff {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter internet browser");
        String browser = scanner.next();

        if (browser=="Chrome") {System.out.println("Proceed with Chrome browser");}

        if  (browser=="Firefox") {System.out.println("Proceed with Firefox browser");}
        if  (browser=="IE") {System.out.println("Proceed with IE browser");}

        else {System.out.println("Invalid browser");}
    }
}
