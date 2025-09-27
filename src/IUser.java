public interface IUser {
    void createAccount(String accType);
    void removeAccount(int accNo);
    void printAllBalances();
    BaseAccount getAccount(int accNo);
}
