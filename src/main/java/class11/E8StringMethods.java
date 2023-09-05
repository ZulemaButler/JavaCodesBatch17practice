package class11;

public class E8StringMethods {
    public static void main(String[] args) {
        String str="Hi there how are you doing. I am good. I am driving";
        String[] strs= str.split("[.]");

        System.out.println(strs.length);
        System.out.println(strs[2].trim());
    }
}
