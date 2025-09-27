public class CurrentAccount extends BaseAccount{
    CurrentAccount(int startingBal){
        this.balance=startingBal;
    }
    public void withdrawMoney(int amount){
        if(amount>balance){
            System.out.println("Insufficient balance!");
            return;
        }
        balance-=amount;
        System.out.println("Withdrawl succesfull.");
    }
}
