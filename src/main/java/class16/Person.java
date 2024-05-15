package class16;

public class Person {
    //make sure fields are private, they store your data, not to be changed by anyone
        private String name; //instance variable
        private int age;
        private double weight;
        private char gender;
        private int salary;
        private String hairColor;


    //the access modifier is usually public-- a constructor does not have void
    //public Person() {
        public Person() {

}
    public Person(String name, int age, double weight) {
        this.name = name; //"this." method will always access the instance variable
        this.age = age;
        this.weight = weight;
    }

    public Person(String name, int age, double weight, char gender) {
        this.name = name; //more constructors gives more options for inputting ending user
        this.age = age;
        this.weight = weight;
        this.gender = gender;
    }

    public Person(String name, int age, double weight, char gender, int salary, String hairColor) {
        this(name, age, weight, gender);
        this.salary = salary;
        this.hairColor = hairColor;
    }

    public void printInfo() {
        String name = "Giu"; //by default local variable  have more priority over instance variable without "this."
        System.out.println(this.name + " " + age + " " + weight + " " + gender+" "+salary+" "+hairColor);
    }

}



