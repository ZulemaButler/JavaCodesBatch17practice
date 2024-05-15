package class23;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount b=new BankAccount("Rose",123453,160000,"Porkchop","PW123","Checking");
        System.out.println(b.getName());
        System.out.println(b.getBankAccountNumber());
        b.setName("Porscha");
        System.out.println(b.getName());

    }

    }

