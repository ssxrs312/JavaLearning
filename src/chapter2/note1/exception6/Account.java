package chapter2.note1.exception6;

public class Account {
    protected double balance;

    public Account(double init) {
        this.balance = init;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt){
        this.balance += amt;
    }

    public void withdraw(double amt) throws OverdraftException {
        if (balance<amt){
            throw new OverdraftException("余额不足",amt-this.balance);
        }
        this.balance -= amt;
    }

    public static void main(String[] args) {
        //开户存了1000
        Account a = new Account(1000);
        //存钱1000
        a.deposit(1000);
        //查看余额
        System.out.println(a.getBalance());

        try {
            a.withdraw(2001);
        } catch (OverdraftException e) {
            System.out.println("透支金额：" + e.getDeficit());
            e.printStackTrace();
        }
    }


}
