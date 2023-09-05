package class15;

public class CarTester {
    public static void main(String[] args) {


        Car c1 = new Car("Benz","500E","Black",75000);
        c1.printInfo();
        c1.setPrice(55000);
        c1.printInfo();
        System.out.println(c1.getPrice());
    }
}