package class24;

public class E5BoxingUnBoxing {
    public static void main(String[] args) {
        int a=10;
        Integer number=new Integer(10); //primitive to class is call boxing
        int d=number.intValue();               //converting a primitive back to a class is Unboxing
        System.out.println(d);


        Integer c=10; //autoBoxing
        int f=c;      //autoUnboxing
        System.out.println(f);



    }
}
