package class14;

public class BankAccount {
   private String name="Porkchop";
  private  String userName="Porkchop123";
  private  String psssword="pass123";
   private double accountBalance=300;
  private  String accountNumber="12345";

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        System.out.println(bankAccount.name);
    }

}
