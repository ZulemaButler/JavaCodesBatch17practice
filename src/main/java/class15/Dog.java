package class15;

public class Dog {

    private String name; //use private so that no one can make any changes
   private String breed;  //instance variables are used to stored data related to
   private   String color;// our objects--data to share across our method class
    private int age;

    //in order for constructor to be access in any package it must be 'public"
   public Dog(String dName, String dBreed, String dColor, int dAge ){ //constructors help use give initial values to instance
        name=dName;
        breed=dBreed;     //the name must be the same as the class
        color=dColor;
        age=dAge;
        bark();

    }
    public Dog(String dName, String dBreed, String dColor) {
        name=dName;
        breed=dBreed;
        color=dColor;


    }
  public  void bark(){
        System.out.println("Woof Woof...");
    }
   public void printInfo(){
        System.out.println(name+ " "+breed+" "+color);
    }
}
