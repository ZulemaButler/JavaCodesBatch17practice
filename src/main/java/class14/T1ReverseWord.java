package class14;
public class T1ReverseWord { //how would you reverse a String word by word?
    //input=> This is a sentence I was to reverse
    //output=> siht si ecnetnes i tnaw ot esrever
    public static void main(String[] args) {

        String str = "This is a sentence I want to reverse";
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) { // for (int i = 0; i <=arr.length-1; i++)
           String word=arr[i];
           String reversed= reverseStr(word);
            System.out.print(reversed+" ");
        }
        System.out.println(reverseStr("this"));
    }
    static String reverseStr(String inputStr) {

        String reversed="";
        for (int i = inputStr.length()-1; i>= 0; i--) {
            reversed=reversed+inputStr.charAt(i);
        }
        return reversed;

    }


}
