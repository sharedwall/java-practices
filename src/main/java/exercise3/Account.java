package exercise3;

import java.util.Objects;

public class Account {
    private final int id;
    private final Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        balance = 0.0;
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount) {
        balance+=amount;
    }

    public void withdraw(double amount){
        if (balance >= amount){
            balance-= amount;
        }else {
            System.out.println("Amount withdraw exceeds the current balance!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return getId() == account.getId() && Double.compare(account.getBalance(), getBalance()) == 0 && getCustomer().equals(account.getCustomer());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCustomer(), getBalance());
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
