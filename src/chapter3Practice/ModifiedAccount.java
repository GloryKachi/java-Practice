package chapter3Practice;

/*3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called
withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
the Account’s balance. If it does, the balance should be left unchanged and the method should print
a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
(Fig. 3.9) to test method withdraw.*/

public class ModifiedAccount {
    private String accountName;
    private int balance;
    private int amount;


    public ModifiedAccount(String accountName,int balance) {
        this.accountName = accountName;
        if (balance >= 0) {
            this.balance = balance;
        }

    }
    public int getBalance(){
        return balance;
    }
    public void withdraw(int amount) {
        if(amount <= balance) {
            balance = balance - amount;
        }
        else {
            System.out.println("Withdrawal amount exceeds account balance");
        }
        if (amount == balance){
            System.out.println("Account can't be left empty");
        }

    }

    public int deposit(int balance,int amount) {
        if (balance > 0){
            balance = balance + amount;
        }

        return (int) balance;
    }
}
