package class7;

public class E6NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j= i; j < 5; j++) { //this code will start from j to i > higher to low
                System.out.print("*");
            }
            System.out.println();
        }
    }}