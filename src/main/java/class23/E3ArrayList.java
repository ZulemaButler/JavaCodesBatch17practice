package class23;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList<>();
        String str="Sexy";
        arr.add(str);

        arr.add("15");
    }
    void checkPrint(ArrayList aa){
        for (Object d:aa){
            String str=(String)d;
            System.out.println(str.length());
        }
    }
}
