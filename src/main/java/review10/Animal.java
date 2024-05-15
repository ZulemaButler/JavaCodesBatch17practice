package review10;

public class Animal {
    void speak(){
        System.out.println("Animals Speak");
    }
    void eat(){
        System.out.println("Anmials Eat");
    }

}
class Dog extends Animal{
    @Override
    void speak() {
        super.speak();
        System.out.println("Woof Woof");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Yum Yum");
    }
}
class Cat extends Animal{
    @Override
    void speak() {
        super.speak();
        System.out.println("Meow Meow");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Meeeeeow");
    }
}