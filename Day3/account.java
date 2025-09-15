package Day3;

class BalanceCheck {
    static double minimum = 1000.00;

    public void checkBalance(double balance) {
        if (balance < minimum)
            System.out.println("Balance is less than minimum");
        else
            System.out.println("Balance is equal or greater than the mininum");
    }
}

public class account {
    public static void main(String[] args) {
        BalanceCheck obj1 = new BalanceCheck();
        double balance = 1432423;
        obj1.checkBalance(balance);
    }
}