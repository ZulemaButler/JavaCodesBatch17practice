package class3;

public class E1TypeCasting {
    public static void main(String[] args) {

        // long cannot fit into int
        //byte>short>int>long>double
        //long age=12;
        //int myAge=age;

        // byte myAge=age;
        // byte can fit in to int
        byte number=10;
        int number2=number;
        System.out.println(number2);

        float num1=15.6f;
        int num2;
        num2=(int)num1;

        System.out.println(num2);


    }

}
