package class9;

public class E42DArrays {
    public static void main(String[] args) {

// this program will run all the numbers inside the {}
       int [][] numbers={
        {10,20,30,40},
        {100,200,300,400},
        {1000,2000,3000,4000}};

       // for (int row =0; row <3; row++) { //writes all the numbers inside{} vertical
          //  for (int col = 0; col<4; col++){
             //   System.out.print(numbers [row][col]+" ");

       for (int row =0; row < numbers.length; row++) { // this code will write numbers on different row
           for (int col = 0; col <numbers[row].length; col++){
              System.out.print(numbers [row][col]+" ");
           }
          System.out.println();
       }


    }}

