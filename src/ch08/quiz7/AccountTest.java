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

    public String getNum() {
        return num;
    }

    public boolean transfer(Account z, int money){
        this.balance -= money;
        z.balance += money;
        System.out.printf("%s 계좌에서 %s 계좌로 송금이 되었습니다.\n",
                this.getNum(), z.getNum());
        if(this.balance<money){
            System.out.println("잔액이 부족해서 송금이 불가능합니다");
            return false;
        }
        return true;
            //return (this.balance < money ? false : true);
            //while 루프 탈출하려면 balance<money일때 false가 되어야 하니까
    }

    public String toStr() {
        return "Account{" +
                "num='" + num + '\'' +
                ", balance=" + balance +
                '}';
    }
}