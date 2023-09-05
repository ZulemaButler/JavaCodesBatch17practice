package class11;
/*create a String and if the String is not empty perform the following:
If the string has an odd number of character and has 3 or more characters, print the character int eh middle
of the String.

 */
public class T1StringMethods {
    public static void main(String[] args) {
        String str="ada";

        if(str.length()%2!=0&&str.length()>=3){
            int middle=str.length()/2;
            System.out.println(str.charAt(middle));
        }


    }
}

