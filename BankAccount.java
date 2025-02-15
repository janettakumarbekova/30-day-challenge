public class BankAccount {
    private double balance; // Закрытое поле

    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }

    // Метод для пополнения счета
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Баланс пополнен на " + amount);
        } else {
            System.out.println("Неверная сумма");
        }
    }

    // Метод для снятия средств
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Снято " + amount);
        } else {
            System.out.println("Недостаточно средств или неверная сумма");
        }
    }

    // Метод для получения баланса
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(30);
        System.out.println("Текущий баланс: " + account.getBalance());
    }
}
