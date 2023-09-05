package class15;

public class Car {  //instances
    private String make;
    private String model;
    private String color;
    private double price;

   public Car(String cMake, String cModel, String cColor, double cPrice){  //constructors
        make=cMake;
        model=cModel;
        color=cColor;
        price=cPrice;
    }
    public void printInfo(){
        System.out.println(make+" "+model+" "+color+" "+price);
    }
        void setPrice(double cPrice){
       price=cPrice;
   }
        double getPrice(){
       return price;
        }
    }
