package class25;

import java.util.LinkedList;

public class E6Maps {
    public static void main(String[] args) {
        LinkedList<Dog> dogs=new LinkedList<>();
        dogs.add(new Dog("Jacky","Persion"));
        dogs.add(new Dog("Jim","German"));
        dogs.add(new Dog("Tim","German"));
        //getting the object stored on index 2 and storing it inside the d variable
        Dog d=dogs.get(2);
        d.printInfo();  //You can store the object of any class inside in any Array or Linked list.
    }
}
class Dog{
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+breed);
    }
}



