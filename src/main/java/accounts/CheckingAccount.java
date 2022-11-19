package accounts;

public class CheckingAccount extends Accounts {

    public CheckingAccount(String name, long balance) {
        super(name, balance);
    }

    @Override
    public boolean pay(long amount) {
        if ((super.getBalance() - amount) >= 0) {
            return super.pay(amount);
        } else {
            return false;
        }
    }


}
