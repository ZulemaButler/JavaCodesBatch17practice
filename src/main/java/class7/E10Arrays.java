package class7;

public class E10Arrays {
    public static void main(String[] args) {
//creating the array and also initializing it
        String [] fruit={ "Apple","Orange", "Banana", "Kiwi", "Mango", "Pineapple"};
       fruit[3]="Papaya"; // updating the context of an arrays
        // this code will replace the value of whatever you have for that number

        for (int i=0; i <fruit.length; i++){
            System.out.println(fruit[i]);
    }
}}
