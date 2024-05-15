package class24;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        ArrayList <String> names=new ArrayList<>();
        names.add("Porscha");
        names.add("Ash");
        names.add("Kay");
        names.add("Nabs");
        names.add("Mann");
        names.add("Ish");
        names.remove(0);
        System.out.println(names);
        names.add(3, "Bugs");
        System.out.println(names);
        names.set(1,"Kayson");
        System.out.println(names);





    }
}
