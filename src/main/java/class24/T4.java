package class24;

import java.util.ArrayList;

/*Create an ArrayList of even numbers from 1 to 500 using a loop. Then write another loop to
Remove any number that is divisible by 5 from that ArrayList.
        */
public class T4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i < 500; i=i+2) {
        numbers.add(i);
        }
        System.out.println(numbers);
        /*for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%5==0){
                numbers.remove(i);
            }
        }*/
        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);
    }
}
