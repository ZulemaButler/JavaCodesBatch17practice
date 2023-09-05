package class10;

public class DogTester {
    public static void main(String[] args) {
        //creating an object from the Dog class
        Dog lunaObj=new Dog(); // <= creating an obj
        // from the Dog class
        //assigning an value to name using lunaOgj
        lunaObj.name="Luna";
        lunaObj.gender='F';
        lunaObj.breed="Pitbull";
        lunaObj.weight=60;
        lunaObj.age=9;
        System.out.println(lunaObj.name);
        System.out.println(lunaObj.age);
        System.out.println(lunaObj.breed);

//we are calling the bark method on lunaObj
        lunaObj.bark();
        // we are calling the eat method on lunaObj
        lunaObj.eat();
 //we are calling the sleep method on lunaObj
        lunaObj.sleep();



    }
}
