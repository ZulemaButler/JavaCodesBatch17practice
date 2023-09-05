package class8;

public class T3Arrays {
    public static void main(String[] args) {
       //count how many numbers are greater than 10 in below array
        //expected answer 3

        int [] num1={10,20,4,3,8,45,96};
        int count=0; // must be out the loop if inside it will reset it back to zero
        for (int i =0; i < num1.length; i++) {

            if (num1 [i]>10){
                count++;

       }

    }
        System.out.println(count); //the print has to be out the loop
}}
