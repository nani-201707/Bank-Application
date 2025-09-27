import java.util.ArrayList;

public class User implements IUser{
    private ArrayList<BaseAccount> accounts;
    User(){
        this.accounts=new ArrayList<>();
    }
    @Override
    public void createAccount(String accType) {
        if(accType.equals("SAVINGS")){
            accounts.add(new SavingsAccount(0));
        }else{
            accounts.add(new CurrentAccount(0));
        }
        // Tried to create random acount Number but complicated
    }

    @Override
    public void removeAccount(int accNo) {
        for(BaseAccount acc:accounts){
            if(acc.getAccountNum()==accNo){
                accounts.remove(acc);
                System.out.println("Successfully deleted.");
                return;
            }
        }
        System.out.println("No such account found!");
    }

    @Override
    public void printAllBalances() {
        for(BaseAccount acc:accounts){
            System.out.println("Account-"+acc.getAccountNum()+" : "+acc.checkBalance());
        }
    }

    @Override
    public BaseAccount getAccount(int accNo) {
        for(BaseAccount acc:accounts){
            if(acc.getAccountNum()==accNo){
                return acc;
            }
        }
        System.out.println("No such account found!");
        return null;
    }
}
