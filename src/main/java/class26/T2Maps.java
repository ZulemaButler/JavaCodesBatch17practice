package class26;
/*n Create a map of countries () with its capital that will store countries in abc order. Country names will be
keys and caps will be values
Print all keys and values from a country map using for each lop or Lambda
Print all values from a country map using for each loop or Lambda


Only print those countries which contain more than 5 letters and the letter "a" in their country

 */

import java.util.TreeMap;
/*
Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
Print all keys and values from a country map using for each loop or Lambda.
Print all values from a country map using for each loop or Lambda.

 */
public class T2Maps {
    public static void main(String[] args) {
        TreeMap<String, String> countries= new TreeMap<>();

        countries.put("USA, ","Washington, DC" );
        countries.put("Mexico, ", "D.F.");
        countries.put("Dominican Republic, ", "Santo Domingo");
        countries.put ("Russia, ", "Moscow");
        countries.put("France, ", "Paris");

        countries.forEach((k,v)-> {
            if (k.length() > 5 && v.contains("a")) {

                System.out.println(k + " " + v);}

        });


    }

}
