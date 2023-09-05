package class3;

public class E3TypeCasting {
    public static void main(String[] args) {

        int number=100;
        byte number2=(byte)number;
        System.out.println(number2);

        short box1=2000;
        int box2=box1; //implicit/auto-- when putting smaller data into a bigger data
        System.out.println(box2);
    }
}
