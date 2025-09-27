//import java.util.Random;
public abstract class BaseAccount implements Account{

    protected int balance;
    protected int accountNum;
    protected static int accCount=0;
//    private static final Random rand=new Random();
    BaseAccount(){
        accCount++;
        this.accountNum=accCount;
//        this.accountNum=generateAccNum();
    }
    public int getAccountNum(){
        return accountNum;
    }

    /*
    private int generateAccNum(){
        return 100000+rand.nextInt(900000);
    } */

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
