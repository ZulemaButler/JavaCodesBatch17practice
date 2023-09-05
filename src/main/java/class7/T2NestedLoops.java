package class7;

public class T2NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i<4; i++){

            for (int j = 0; j<7; j++)
             if (j!=3) //this code will exclude the #3 from printing
             {System.out.print(j+" ");}

            System.out.println();
        }
    }
}
