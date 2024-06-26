package class23;

public class BankAccount {
    private String name;
    final private long bankAccountNumber;
    private double balance;
    final private String userName;
    private String password;
    final private String accountType;


    //you can right-click, select generate and select "constructor' and select the fields you want to initialize it.
    public BankAccount(String name, long bankAccountNumber, double balance, String userName, String password, String accountType) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
    }

    public BankAccount(long bankAccountNumber, String userName, String password, String accountType) {

        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;

    }

    public BankAccount(String userName, String accountType, long bankAccountNumber) {

        this.bankAccountNumber = bankAccountNumber;
        this.userName = userName;
        this.accountType = accountType;
    }

    public String getName() {
        return name;
    } //shows/read the value

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    void setName(String name) {
        this.name = name;
    }
}