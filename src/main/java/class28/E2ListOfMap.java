package class28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E2ListOfMap {
        public static void main(String[] args) {

            List<String> names = new ArrayList<>();
            String name = "Dulma";
            names.add(name);

            String n = names.get(0);
            System.out.println(n);

            //THis is going to create a list that will contain maps
            List<Map<String, String>> mapList = new ArrayList<>();

            //Map that can contain key value pairs of type String
            Map<String, String> map = new HashMap<>();
            map.put("Name", "Ehab");
            map.put("City", "MaryLand");
            map.put("Age", "150");
            map.put("Salary", "1500000");
            // adding the complete map on index 0
            mapList.add(map);

            Map<String, String> map1 = new HashMap<>();
            map1.put("Name", "Fahim");
            map1.put("City", "California");
            map1.put("Age", "200+");
            map1.put("Salary", "2000000");
            mapList.add(map1);

            // we are getting the complete map back from the list
            Map<String, String> firstMap = mapList.get(0); //will print out all the info of index 0


            //System.out.println(firstMap);
            System.out.println(firstMap.get("Name"));



            //if you do not know the data type you can use "var"


        }
    }

