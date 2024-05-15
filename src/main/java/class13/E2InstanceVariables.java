package class13;

public class E2InstanceVariables {

    String name= "Butler";

    void printAge(){
        int age=25;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);
    }
    void printCountry(){
       // System.out.println(age); ould get an error cause its a local variable and it cannot accessed here
        System.out.println(name);
        System.out.println(country);
        if(10>5){
            System.out.println();
        }

    }
    static String country="Mexico";
}
