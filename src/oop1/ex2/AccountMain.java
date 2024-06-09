package oop1.ex2;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        //10,000원 입금
        account.deposit(10000);

        //9,000원 출금
        account.withdraw(9000);

        //2,000원 출금, 잔액부족 출력
        account.withdraw(2000);
        System.out.println("잔고: " + account.balance);
    }
}
