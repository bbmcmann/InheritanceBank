public class CurrentAccount extends Account{

    private double overdraftLim;
    private boolean inOverdraft;
    public CurrentAccount(int a, double overdraftLim){
        super(a);
        this.overdraftLim = overdraftLim;
    }

    public String letter(){
        return "Bruh, calm down, you are in overdraft. Get trashed";
    }

    public void withdraw(double sum){
        if(getBalance() - sum < overdraftLim){
            inOverdraft = true;
        } 
        else{
            super.withdraw(sum); 
        }
    }

    public void update(){
        if(inOverdraft){
            System.out.println(letter());
        }
    }

}