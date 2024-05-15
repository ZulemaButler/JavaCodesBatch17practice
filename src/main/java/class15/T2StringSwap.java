package class15;

public class T2StringSwap {
    public static void main(String[] args) {
        String str1="Porscha";
        String str2="Bonilla";
       str1= str1+str2; //will give first and last name
       str2 = str1.substring(0,str1.length()-str2.length());
        System.out.println(str2);


    }
}
