package ch08.ex8_8;

import java.util.Scanner;

public class MainAccount {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.printf("계좌번호(5자리): ");
        String accountNumber = scanner1.next();
        System.out.printf("이름: ");
        String name = scanner1.next();
        System.out.printf("비밀번호(4자리): ");
        String password = scanner1.next();
        System.out.printf("입금할 금액:");
        int balance = scanner2.nextInt();

        //처음 통장 개설시
        Account account = new Account(accountNumber, name, password, balance);
        System.out.println(account);
        System.out.printf("계좌의 현재 잔액은 %d원입니다.\n",account.getBalance());

        //통장에서 입금
        System.out.printf("입금할 금액: ");
        int money1 = scanner2.nextInt();
        account.deposit(money1);
        System.out.println(account.getBalance());

        //통장에서 출금
        System.out.printf("출금할 금액: ");
        int money2 = scanner2.nextInt();
        account.withdraw(money2);
        System.out.println(account.getBalance());

        scanner1.close();
        scanner2.close();
    }
}
