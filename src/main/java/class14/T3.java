package class14;
//create a method that will take a String as a parameter and returns reversed String. Method should be available
//to all classes within your project and accessible by class name.
public class T3 {
    public static void main(String[] args) {


        String string = "I love you";

        System.out.println( string);

        char str[] = string.toCharArray();

        int n = str.length;

        int start = 0, end = n - 1;

        while (start <= end) {
            char temp = str[start];

            str[start] = str[end];

            str[end] = temp;

            start++;

            end--;

            String reversedString = String.valueOf(str);


            System.out.println("Reversed string: " + reversedString);


        }
    }
}