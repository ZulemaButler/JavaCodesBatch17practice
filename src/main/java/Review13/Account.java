package Review13;

public class Account {

        private double accountBalance;
        Account(double accountBalance){
            this.accountBalance=accountBalance;
        }

        void transferFunds(double amount)throws insufficientAccountBalanceException{

            if(amount>accountBalance){
                throw new insufficientAccountBalanceException("You don't have enough funds");


            }

        }
    }

    class AccountTester{
        public static void main(String[] args) {
            Account account=new Account(100);
            account.transferFunds(12000);
        }
    }
