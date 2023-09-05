package class9;

public class Review2DArray1 {
    public static void main(String[] args) {

                             //[row] [col]
        int [][] array=new int [2][4]; //15
        array [0][0]=12;
        array[0][1]=13;
        array [0][2]=14;
        array [0][3]=15;

        //2 row
        array [1][0]=1;
        array [1][1]=2;
        array [1][2]=3;
        array [1][3]=4;

        System.out.print(array[0][3] +" "); //15
        //how to get all elements from 2D array?
        //array. length in 2D array returns number of rows
        //array[row].length in 2D array returns number of colum from that row

        for (int row=0; row<array.length; row++) {      //outer loop iterates over rows
            for (int col=0;col<array[row].length; col++) {      //inner loop iterates over the colums

                System.out.println(array[row][col]);
        }
    }
}}
