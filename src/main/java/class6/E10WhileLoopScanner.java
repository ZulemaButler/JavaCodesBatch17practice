package class6;

import java.util.Scanner;

public class E10WhileLoopScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in); //to input info using scanner
        System.out.println("Please enter Starting point");

        int start= scanner.nextInt();
        System.out.println("Please enter the ending point");
        int end= scanner.nextInt();
        System.out.println("Please enter the steps as well");
        int step=scanner.nextInt();
        while (start <= end){
            System.out.print(start+ " ");
            start+=step;
    }
}}
