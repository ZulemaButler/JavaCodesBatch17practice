package class7;

public class E4NestedLoops {
    public static void main(String[] args) {

        int y = 1;
        while (y <+4) {

            int x = 1;
            while (x <= 5) {
                System.out.print("iiiii");
                x++; // <==to stop from running infinite
            }
            System.out.println();
            y++;
        }
    }}