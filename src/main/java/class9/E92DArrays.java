package class9;

import java.util.Arrays;

public class E92DArrays {
    public static void main(String[] args) {
        String[][] names = {
                {"Me", "Ash", "Kay", "Nabs"},
                {"Sam", "Green", "Boo", "Love"},
                {"Happy", "Sad", "Mann", "Ish"},
                {"Carlos", "Nick", "Nate", "Lotto"}
        };

         //int [] num={10,20,30,40};
        //for (int n : num) {
           // System.out.println(n);}

           for (String[] row:names) {
               for (String v : row) {
                  System.out.println(v + " ");

                  System.out.println();}

                   System.out.println(Arrays.deepToString(row)); //for printing 2d arrays
                   {

                   }

               }
           }}