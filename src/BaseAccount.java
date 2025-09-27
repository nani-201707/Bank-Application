public abstract class BaseAccount implements Account{

    protected int balance;
    protected int accountNum;
    protected static int accCount=0;

    BaseAccount(){
        accCount++;
        this.accountNum=accCount;
    }
    public int getAccountNum(){
        return accountNum;
    }

    public static void getAccountsCount(){
        System.out.println("Number of accounts hold by the user: "+accCount);
    }

    @Override
    public void depositMoney(int amount) {
        balance+=amount;
        System.out.println("Successfully deposited.");
    }

    @Override
    public abstract void withdrawMoney(int amount);

    @Override
    public int checkBalance() {
        return balance;
    }
}
