public class Bank{

    Account[] accounts;

    public Bank(Account[] accounts){
        this.accounts = accounts;
    }

    public void update(){
        for(int i = accounts.length-1; i >= 0; i--){
            if(accounts[i] instanceof CurrentAccount){
                ((CurrentAccount) accounts[i]).update();
            }
            else if(accounts[i] instanceof SavingsAccount){
                ((SavingsAccount) accounts[i]).update();
            }
        }
    }

}