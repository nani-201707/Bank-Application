public class Main {
    public static void main(String []args){
        User userOne=new User();
        userOne.createAccount("SAVINGS");
        userOne.createAccount("CURRENT");
        BaseAccount cur=userOne.getAccount(2);
        cur.depositMoney(3000);
        userOne.printAllBalances();
        cur.withdrawMoney(4000);
        cur.withdrawMoney(2500);
        userOne.printAllBalances();

        //User-2
        User userTwo=new User();
        userTwo.createAccount("SAVINGS");
        userTwo.createAccount("CURRENT");
        userTwo.getAccount(3).depositMoney(5000);
        //Account number isn't used as 1 or 2 bcz,it must be unique for every user,if you want like that,make count var in user.java and pass it to BaseAccount to assign accNumber
        userTwo.getAccount(4).depositMoney(1000);
        userTwo.printAllBalances();
        userTwo.removeAccount(4);

    }
}
