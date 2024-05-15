package class24;

import java.util.ArrayList;

/*
create an arrayLIst of fruit then remove all the fruit which contains the letter a or end with the letter e
 */
public class T5 {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();




        fruit.add("apple");
        fruit.add("orange");
        fruit.add("grapes");
        fruit.add("cherries");
        fruit.add("kiwi");
        fruit.add("banana");
        fruit.removeIf(d->d.contains("a")||d.endsWith("e"));
        System.out.println(fruit);



    }

}
