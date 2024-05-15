package class19;

/*
1.Create a class 'Degree' having a method 'getPrerequisite' that prints "To get a degree you need a high school diploma."
Class Degree has 2 subclasses namely 'Bachelors' and 'Masters'. In Masters class override methode 'getPrerequisite'
all the method by creating an object of each of the 3 classes
2.Create a class CreditCard and define variable balance and interest. Create an instance method that will
calculate interest based on the given balance.
create 2 subclasses: Visa adn AX. In AX class override method calculate interest.
Call the method by creating an object of each of the 3 classes.

 */
public class Degree {

    public void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma :");
    }
}

class Bachelors extends Degree {

}

class Masters extends Degree {


    public void getPrerequisite() {

        System.out.println("You will get master if you have bachelor degree");
    }


    void check(){

    }
}

class Tester {
    public static void main(String[] args) {
        Degree obj2 = new Degree();
        obj2.getPrerequisite();
        Bachelors obj1 = new Bachelors();
        obj1.getPrerequisite();
        Masters obj = new Masters();
        obj.getPrerequisite();
    }
}

