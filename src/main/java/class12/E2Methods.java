package class12;
// if you want to create a method, whose results you want to store in other classes.
// to use a class info in another class, you must remove the "void"
//and specify a data type
public class E2Methods {
   int add(int num1, int num2){ // anything other than void, you must have at least one return
       int result=num1+num2;

       return result; //whenever you see a return requirement never use void
   }

   //create a method which takes a number multiply it with 10 and returns the results

    int multiply(int num){
       int res=num*10;
       return res;

    }
}
