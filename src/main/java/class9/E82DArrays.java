package class9;

public class E82DArrays {
    public static void main(String[] args) {
        int [][] numbers={
                {10,20,30,40},
                {100,200,300,400},
                {1,2,3,4}};
      for(int [] row:numbers){
          for (int col:row){
              System.out.print(col +" ");
          }
          System.out.println();
      }

    }
}
