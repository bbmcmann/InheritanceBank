public class CurrentAccount extends Account{

    private double overdraftLim;
    public CurrentAccount(int a, double overdraftLim){
        super(a);
        this.overdraftLim = overdraftLim;
    }

    public void withdraw(double sum){
        if(getBalance() - sum < overdraftLim){
            System.out.println("Bruh, calm down, you are in overdraft. Get trashed");
        } 
        super.withdraw(sum); 
    }

}