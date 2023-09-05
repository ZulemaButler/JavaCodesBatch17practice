package class8;

public class ArrayReview2 {
    public static void main(String[] args) {

        double [] price={1.99,12.09,1,4.50};

        for (double number: price){
            System.out.println(number);

        }
        // regular for loop

        for (int i=0;i< price.length; i++)
            System.out.println(price[i]);
}}
