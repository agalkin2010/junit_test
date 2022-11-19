import accounts.CheckingAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAccounts {

    CheckingAccount checkingAccount = new CheckingAccount("checkingAccount", 100);

    @Test
    public void testCheckAccountBalance() {
        long result = checkingAccount.getBalance();
        long expected = 100;
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCheckAccountPayFalse() {
        boolean result = checkingAccount.pay(500);
        Assertions.assertFalse(result);
    }

    @Test
    public void testCheckAccountPayTrue() {
        boolean result = checkingAccount.pay(50);
        Assertions.assertTrue(result);
    }

}
