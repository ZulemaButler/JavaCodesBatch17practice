package class14;
public class T2 {
    //create a method that will accept an array as a parameter and will return a sum of all
    // elements from that
    //array. Method should be visibly only within same package and accessible
    // by the creating an instance/object
    //of the class.
    public static void main(String[] args) {
        T2 t1=new T2();
        int[]array = {10,25,15};
        System.out.println(t1.getArraySum(array));

    }
        int getArraySum ( int[] arr){
            int sum = 0;
            for (int n : arr) {
                sum = sum+n;
            }
            return sum;
        }

    }

