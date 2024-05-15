package class24;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {// this is how we write a loop

        ArrayList<String> names=new ArrayList<>();
        names.add("Porscha");
        names.add("Ash");
        names.add("Kay");
        names.add("Nabs");
        names.add("Mann");
        names.add("Ish");
        for (int i =0;i<names.size();i++){
            System.out.println(names.get(i));
        }
        System.out.println("*********************^^Normal For Loop**********************************************");


        for(String n:names){   //this is an enhance for loop
            System.out.println(n);
        }
        System.out.println("**********************^^Enhance For loop*********************************************");
        //while loops
        int i=0;
        while (i< names.size()){
            System.out.println(names.get(i));
            i++;
        }
        System.out.println("***********************^^while loop********************************************");
    }

}
