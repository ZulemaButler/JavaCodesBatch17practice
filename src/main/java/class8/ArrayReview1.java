package class8;

public class ArrayReview1 {
    public static void main(String[] args) {
        int a =10;

        int [] array={10,11,23,22,66,88,7};

        int numberOfElements=array.length;
        System.out.println(numberOfElements);
        System.out.println(array[3]); //getting 1 element from an array

                /*when to use loops --when you to repeat a block of code

               - when we do not know the exact number of iterations - while of do while --
               - when we know how many times we want to repeat or iterate the code -for loop or enhanced for loop
                -we use enhanced for loop only with array or collections
                 */

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +" ");

        }
        /*enhanced for/ for each loop/advance for--loop syntax
            for (DataTypeofElement anyVariableName:NameofTheDataStructure)

         */

        // int [] array={10,11,23,22,66,88,7};
            for (int ar:array){
                System.out.print(ar +" ");
    }

    }





}
