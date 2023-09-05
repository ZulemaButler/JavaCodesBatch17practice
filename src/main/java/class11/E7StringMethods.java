package class11;
//This program replaces the word in the String with what is printed out
public class E7StringMethods {
    public static void main(String[] args) {
        String str= "1UHd  2GJdfd 3AaBbCcks2467#^ss 4&$*%";
        System.out.println(str.replaceAll("[A-Z]","<3"));
        System.out.println(str.replaceAll("[a-z]","ABC"));
        System.out.println(str.replaceAll("[0-9]","#"));
        System.out.println(str.replaceAll(" ", ""));
        System.out.println(str.replaceAll("[A-z0-9&-*$-%#-?]", "<3"));

        System.out.println(str.replaceAll("\\w",""));
        System.out.println(str.replaceAll("\\d",""));
        System.out.println(str.replaceAll("[^A-Za-b0-9]","<3"));


    }
}
