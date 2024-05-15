package class25;
// create a Set in which you need to add names of the countries(10). In this Set we want all objects to be stored in ABC order.
//Using 2 different ways to retrieve all elements from set.
import java.util.TreeSet;

public class T3Sets {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("USA");
        names.add("Mexico");
        names.add("Dominican Republic");
        names.add("Canada");
        names.add("Europe");
        names.add("Africa");
        names.add("Puerto Rico");
        names.add("Heaven");
        names.add("Hell");
        names.add("Who cares");
        System.out.println(names);
        System.out.println("*****************************");

        //System.out.println();
        for (String n:names){
            System.out.println(n);
        }
        names.forEach(x-> System.out.println(x));

    }
}
