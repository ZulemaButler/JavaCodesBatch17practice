package class11;

public class E1StringMethods {
    public static void main(String[] args) {
        String str="Batch 17 is great.";

        System.out.println(str.charAt(0)); //this code will print a character data inside the string
        System.out.println(str.charAt(4));

        int length=str.length(); // this code will print total count of characters
        System.out.println(length);

        System.out.println(str.charAt(str.length()-1));// prints out the last index character


        System.out.println("***************");
        int lastIndex=str.length()-1;
       // System.out.println(lastIndex);
        System.out.println(str.charAt(str.length()-1));
        char c=str. charAt(lastIndex);
       System.out.println(c);
    }

}
