package class8;

public class E7BreakKeyword {
    public static void main(String[] args) {
        //you have to search the array for number 45 it present in the array
        //print found

        int [] nums= {10, 23, 25, 56, 45, 20};

        for (int n:nums) {

            if (n== 10) {

                System.out.println("Found");
                break; //write this keyword to terminate once you found what you are looking for
                // to stop searching through a program to save processing time

            }


        }}}