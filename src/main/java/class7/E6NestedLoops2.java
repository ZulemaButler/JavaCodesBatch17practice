package class7;

public class E6NestedLoops2 {

    public static void main(String[] args) {
        for (int j = 0; j <=5; j++) { //outer controls the number of lines are printed going vertical
            for (int i = 0; i <= j; i++) { //inner control the number of outputs
                System.out.print("*");
            }
            System.out.println();
        }
    }
}