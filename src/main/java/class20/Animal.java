package class20;

public class Animal {
    void speak() {
        System.out.println("Animals can speak");
    }

    void sleep() {
        System.out.println("Animals sleep");
    }

    void eat() {
        System.out.println("Animals sleep");
    }
}
    class Dog extends Animal{
        @Override
        void speak() {
            System.out.println("Woof Woof");
        }
    }

    class Cat extends Animal{

        @Override
        void speak() {
            super.speak();
            System.out.println("Meow Meow");
        }
    }

