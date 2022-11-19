package accounts;

public class SavingAccount extends Accounts {

    private long minLimit;

    public SavingAccount(String name, long balance, long minLimit) {
        super(name, balance);
        this.minLimit = minLimit;
    }

    @Override
    public boolean pay(long amount) {
        if ((super.getBalance() - amount) >= this.minLimit) {
            return super.pay(amount);
        } else {
            return false;
        }
    }


}
