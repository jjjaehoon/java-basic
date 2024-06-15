package access;

public class BankAccount {
    private int balance;

    // Alt + Insert Generate 생성 단축키
    public BankAccount() {
        this.balance = 0;
    }

    // public 메서드: deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드: withdraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && (balance - amount) >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // amount 검증
    private boolean isAmountValid(int amount) {
        //금액이 0보다 커야함
        return amount > 0;
    }

    // 잔고 확인
    public int getBalance() {
        return balance;
    }
}
