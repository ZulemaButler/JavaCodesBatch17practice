package class10;

public class CarInventory {
    public static void main(String[] args) {

        Car benz=new Car();
        benz.make="Benz";
        benz.model="500E";
        benz.year=2023;
        benz.price=65000;

        System.out.println(benz.make);
        System.out.println(benz.model);
        System.out.println(benz.year);
        System.out.println(benz.price);

        benz.moveForward();
        benz.parkingAssists();
        benz.breaks();
        {



    }
}}
