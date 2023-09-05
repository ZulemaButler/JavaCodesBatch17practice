package class9;

public class T1Array {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 20, 33, 40},
                {100, 200, 303, 409},
                {16, 2, 35, 49}};
         for (int row=0; row< numbers.length;row++){ //print out only even mumbers
             for (int col =0; col< numbers[row].length;col++){
                 if (numbers[row][col] %2 ==0){ //!= to get odd numbers
                     System.out.print(numbers[row][col] +" ");
                 }
                 System.out.println();
             }

         }
    }}