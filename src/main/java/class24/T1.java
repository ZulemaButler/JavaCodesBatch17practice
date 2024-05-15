package class24;

import java.util.ArrayList;

/*create an ArrayList that will store 5 names into it. Find out whether the given ArrayList is empty or not?
check whether the specific name is present in an ArrayList or not? Find the size of your ArrayLIst and print values from that.
* */
public class T1 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Ash");
        names.add("Kay");
        names.add("Nabs");
        names.add("Mann");
        names.add("Ish");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Ish"));
        System.out.println(names.size());
        System.out.println(names);
    }
}
