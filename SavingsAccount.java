public class SavingsAccount extends Account{

    private double interestRate;
    public SavingsAccount(int a, double interestRate){
        super(a);
        this.interestRate = interestRate;
    }

    public void interest(){
        super.deposit(getBalance() * interestRate);
    }

    public void update(){
        interest();
    }
}