import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingAccount;

public class Main {

    public static void main(String[] args) {

        CheckingAccount checkingAccount1 = new CheckingAccount("Checking Account 1", 1000L);
        SavingAccount savingAccount1 = new SavingAccount("Saving account 1", 500L, 100L);
        CreditAccount creditAccount1 = new CreditAccount("Credit account 1", 100L);

        System.out.println(checkingAccount1.toString());
        System.out.println(checkingAccount1.pay(600L) ? "операция прошла успешно" : "недостаточно средств");
        System.out.println("баланс " + checkingAccount1.getBalance() + " руб");
        System.out.println(checkingAccount1.pay(600L) ? "операция прошла успешно" : "недостаточно средств");
        System.out.println("баланс " + checkingAccount1.getBalance() + " руб");
        System.out.println();

        System.out.println(savingAccount1.toString());
        System.out.println(savingAccount1.pay(400L) ? "операция прошла успешно" : "недостаточно средств");
        System.out.println("баланс " + savingAccount1.getBalance() + " руб");
        System.out.println(savingAccount1.pay(10L) ? "операция прошла успешно" : "недостаточно средств");
        System.out.println("баланс " + savingAccount1.getBalance() + " руб");
        System.out.println();

        System.out.println(creditAccount1.toString());
        System.out.println(creditAccount1.pay(100L) ? "операция прошла успешно" : "недостаточно средств");
        System.out.println("баланс " + creditAccount1.getBalance() + " руб");
        System.out.println(creditAccount1.pay(50L) ? "операция прошла успешно" : "недостаточно средств");
        System.out.println("баланс " + creditAccount1.getBalance() + " руб");
        creditAccount1.add(100L);
        System.out.println("баланс " + creditAccount1.getBalance() + " руб");


    }
}
