package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(-1000); //입금 확인 테스트
        account.withdraw(3000); //출금 확인 테스트

        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance: " + account.getBalance());

    }
}
