package accounts;

class Accounts {

    private long balance;
    private String name;

    public Accounts(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public boolean pay(long amount) {
        this.balance -= amount;
        return true;
    }

    public boolean add(long amount) {
        this.balance += amount;
        return true;
    }

    public long getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Имя счёта \'" + this.name + "\' баланс = " + this.balance + " руб";
    }

}
