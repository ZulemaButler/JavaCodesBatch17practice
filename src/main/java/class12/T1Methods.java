package class12;

public class T1Methods {

    // create a method that will
        //take 2 parameters as a number and prints which number is larger.

        void printLarger(int num1,int num2){
            if (num1>num2){
                System.out.println("Larger number is "+num1);
            }else System.out.println("Larger number is "+num2);

        }



        void checkEvenOdd(int num){
            if (num%2==0){
                System.out.println("is an even number");
            }else{
                System.out.println("its an odd number");
            }
    }
}
