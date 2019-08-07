package chapter2.note1.exception6;

public class CheckingAccount extends Account {

    private double overdraftProtection;

    public CheckingAccount(double init) {
        super(init);
    }

    public CheckingAccount(double init, double overdraftProtection) {
        super(init);
        this.overdraftProtection = overdraftProtection;
    }

    public void withdraw(double awt) throws OverdraftException {
        if (awt > this.balance + overdraftProtection){
            double deficit = awt - (this.balance + overdraftProtection);
            throw new OverdraftException("透支额度超标", deficit);
        }
        this.balance -= awt;
    }

    public static void main(String[] args) {
        //开户存了1000块，拥有500的透支额度
        CheckingAccount a = new CheckingAccount(1000, 500);
        //存了1000
        a.deposit(1000);
        //查询余额
        System.out.println(a.getBalance());//余额2000元

        try {
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
            a.withdraw(600);
            System.out.println(a.getBalance());
        } catch (OverdraftException e) {
            System.out.println("透支超额" + e.getDeficit());
            e.printStackTrace();
        }
    }
}
