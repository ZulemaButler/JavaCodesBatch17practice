package class6;

import java.util.Scanner;

public class E1DoWhileReview {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int x=1;
        int sum=0;
        do{
            System.out.println("Please enter the price of item or -1 to terminate");
            x=scanner.nextInt();
            if (x != -1) {


            sum=sum+x;}
            System.out.println("Your total bill is "+sum);

        }while (x!=-1);


       }
}
