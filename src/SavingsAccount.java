public class SavingsAccount extends BaseAccount {
    SavingsAccount(int startingBal){
        this.balance=startingBal;
    }
    public void withdrawMoney(int amount){
        if(amount>balance){
            System.out.println("Insufficient balance!");
        }else if(amount>20000){
            System.out.println("Withdrawl limit exceeded!");
        }else{
            balance-=amount;
            System.out.println("Withdrawl Successfull.");
        }
    }
}
