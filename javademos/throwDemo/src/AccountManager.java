public class AccountManager {
    private double balance;
    public void deposit(double amount){
        balance = getBalance() + amount;
    }

    public void whitdraw(double amount) throws Exception {
        if(balance>=amount){
            balance = getBalance() - amount;
        }else{
            throw new BallanceInsufficentException("Bakiye Yetersiz");
        }


    }

    public double getBalance() {
        return balance;
    }
}





