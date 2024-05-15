package class17;

public class AnimalTester {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.name=" Tom";
        c.breed="Russ";
        c.color="Black";
        c.age=8;
        c.attitude=true;
         c.printInfo();
         Dog d=new Dog();
         d.bark();
         d.name="Jacky";
         d.breed="Pitbull";
         d.printInfo();

         Animal a=new Animal();

         a.name="Jack and Jill";
         a.breed="PeekAboo";
         a.printInfo();
    }


}
