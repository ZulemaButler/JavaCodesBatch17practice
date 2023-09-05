package class11;

public class E9StringMethod {
    public static void main(String[] args) {
        String str= "Hi there how are you.I am good. I am driving";
       // String [] strArr=str.split("[.\\s]");
        String [] strArr=str.split("[\\s]");
        System.out.println(strArr.length);
       // System.out.println(strArr[4]);
    }
}
