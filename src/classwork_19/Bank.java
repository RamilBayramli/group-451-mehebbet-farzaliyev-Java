package classwork_17;
class Bank {
    String account;
    double balance;
    
    Bank(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(balance);
        }
    }
    void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
            System.out.println(balance);
        } else {
            System.out.println("недастанечно денег");
        }
    }
}
