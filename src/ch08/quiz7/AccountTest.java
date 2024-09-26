package ch08.quiz7;

public class AccountTest {
    public static void main(String[] args){
        Account a = new Account("123-45", 10000);
        Account b = new Account("567-89", 10000);
        while (a.transfer(b,3000)){
            ;
        }
        System.out.println(a.toStr());
        System.out.println(b.toStr());
    }
}

class Account{
    private String num;
    private int balance;

    public Account(String num, int balance){
        this.num = num;
        this.balance = balance;
    }

    public boolean transfer(Account z, int money){
        this.balance -= money;
        z.balance += money;
            return (this.balance < money ? false : true);
            //while 루프 탈출하려면 balance<money일때 false가 되어야 하니까
    }

    public String toStr() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}