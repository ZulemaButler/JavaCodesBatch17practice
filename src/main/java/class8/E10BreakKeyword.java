package class8;

public class E10BreakKeyword {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println("Batch 17 us Greatest of all time");
            if (i%2==0){
                continue;// this keyword is like SKIP
            }
            System.out.println("I'm only kidding");
        }
    }
}
