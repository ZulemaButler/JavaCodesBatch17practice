package class19;
/*
Create 1 class with a static method that has 3 overload forms. Then call each overload method with specific arguments
and observe result.
 */
public class T2 {
    public static void print() {
        System.out.println("Java is great");
    }

    public static void print(String word) {
        System.out.println("Java is "+word);
    }
    public static void main(String[] args){
     
        T2.print("Amazing");

    }

}
