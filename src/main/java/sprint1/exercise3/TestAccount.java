package sprint1.exercise3;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(1000, "Mohammad", 'm');
        System.out.println(customer);

        Account account = new Account(100, customer);
        account.setBalance(25000);
        System.out.println(account);

        account.withdraw(11000);
        System.out.println(account);
        account.withdraw(32000);
        account.deposit(18000);
        account.withdraw(32000);
        System.out.println(account);
    }
}