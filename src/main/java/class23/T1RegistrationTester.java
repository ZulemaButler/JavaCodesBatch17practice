package class23;

public class T1RegistrationTester {
    public static void main(String[] args) {
        Registration r=new Registration("zxbutler@yahoo.com","ChooChoo","Pass123");

        System.out.println("Email: " + r.getEmail());
        System.out.println("Username: "+r.getUserName());
        System.out.println("Password: "+r.getPassword());
    }
}
