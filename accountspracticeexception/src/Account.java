public class Account {
    private double balance;

    public void deposit(double value) throws AccountException {
        if(value <= 10 )
            throw new AccountException(new InsfficateFundException("lala"));
    }

}
