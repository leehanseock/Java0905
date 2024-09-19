package ch08.ex8_8;

public class Account {
    private String accountNumber;
    private String name;
    private String password;
    private int balance;

    public Account(String accountNumber, String name, String password, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //입금하는 메소드 deposit
    public void deposit(int money){
        balance += money;
    }

    //출금하는 메소드 withdraw
    public void withdraw(int money){
        balance -= money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
