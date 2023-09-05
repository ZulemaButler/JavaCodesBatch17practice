package class5;

import java.util.Scanner;

public class T1orOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your birth month");
        String monthName=scanner.next();
        if (monthName.equals("Mar")|| //you can write it like this as well
                monthName.equals("Apr")||
                monthName.equals("May")
        ){
            System.out.println("Season is Spring");
        } else if (monthName.equals("June") || monthName.equals ("July") || monthName.equals("Aug")) {
            System.out.println("You're a summer baby");
        } else if (monthName.equals("Sept")|| monthName.equals("Oct")|| monthName.equals("Nov")) {
            System.out.println("Autumn is your season");}
        else if (monthName.equals("Dec")|| monthName.equals("Jan")|| monthName.equals("Feb")) {
            System.out.println("Brrrr its cold for Winter babies");

        }

    }

    }

