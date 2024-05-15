package class24;

import java.util.ArrayList;

/* Create an ArrayList of cars and retrieve all the values using 2 different ways.
Create an Array list of words. Remove every word that end with "e"
Create an ArrayList of drinks call it, If any drink has letter "a" or "e" replace it with water.
Create an ArrayList of nev en numbers from 1 to 500. Remove any number that is divisible by 5 from that ArrayList.
* */
public class T2 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Booze");
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("Milk");
        drinks.add("Table");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {

            String drink=drinks.get(i); //use to contain a specific letter from a string by extracting
            // the element and store into the string

            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "water");
            }

        }

        System.out.println(drinks);


    }
}
