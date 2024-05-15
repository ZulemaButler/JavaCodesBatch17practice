package class24;
/*
Create an Array list of words. Remove every word that end with "e"
*/

import java.util.ArrayList;

public class T3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");

       /* for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("e")) {
                words.remove(i);
                i--;
            }

        }*/

        words.removeIf(x->x.endsWith("e"));

        System.out.println(words);
    }
}