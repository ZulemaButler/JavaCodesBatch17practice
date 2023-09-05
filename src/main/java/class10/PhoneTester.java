package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iPhoneObj=new Phone();

        iPhoneObj.make="Apple";
        iPhoneObj.model="iphone14";
        iPhoneObj.storage="128Gb";
        iPhoneObj.color="Gold";
        iPhoneObj.price=1200;
        iPhoneObj.picture();
        iPhoneObj.calls();

        System.out.println("******************************");

        System.out.println(iPhoneObj.make);
        System.out.println(iPhoneObj.model);
        System.out.println(iPhoneObj.storage);
        System.out.println(iPhoneObj.color);
        System.out.println(iPhoneObj.price);

        iPhoneObj.picture();
        iPhoneObj.calls();

        System.out.println("*****************************");

        Phone SamsungObj=new Phone();
        SamsungObj.make="Samsung";
        SamsungObj.model="Android";
        SamsungObj.storage="128Gb";
        SamsungObj.color="Purple";
       SamsungObj.price=1500;
    SamsungObj.calls();
    SamsungObj.picture();


    }
}
