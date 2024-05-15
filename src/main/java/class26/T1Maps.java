package class26;

import java.util.LinkedHashMap;
/*
Create a map of a building. Store floor number and its associated company name.
(Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map

 */
public class T1Maps {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> building = new LinkedHashMap<>();

        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Inova");
        building.put(3,"White House");
        building.put(4,"Capital");
        building.put(5,"RFK");
        building.put(7,"White House");

        System.out.println(building);
        System.out.println("Building Size ="  +building.size());
        System.out.println("Building replaced = " +building.replace(3,"Black House"));
        System.out.println("Building removed= " +building.remove(7));

        System.out.println("Updated Building Info = " +building);

    }
}
