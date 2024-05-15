package class14;
/*create a method that will take a String as a parameter and returns reversed String. Method should be available
to all classes within your project and accessible by class name.

* */

public class T3ReversedString {
    public static void main(String[] args) { // with static variables or methods just write the name of the class then
        System.out.println(T3ReversedString.reverseStr("Hello")); //.then name of method, " "
    }
    public static String reverseStr(String inputStr) {

        String reversed="";
        for (int i = inputStr.length()-1; i>= 0; i--) {
            reversed = reversed + inputStr.charAt(i);
        }
        return reversed;




    }
}
