public class Bank{

    Account[] accounts;
    double dividend;

    public Bank(Account[] accounts, double dividend){
        this.accounts = accounts;
        this.dividend = dividend;
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

    public void addAccount(Account newAccount){
        Account[] temp = new Account[accounts.length+1];

        for(int i = 0; i < accounts.length-1; i++){
            temp[i] = accounts[i];
        }
        temp[temp.length-1] = newAccount;

        accounts = temp;
    }    

    public void killAccount(int x){
        Account[] temp = new Account[accounts.length-1];

        for(int i = 0; i < accounts.length-1; i++){
            if(i == x){

            }
            else{

            }
            temp[i] = accounts[i];
        }
        temp[temp.length-1] = newAccount;

        accounts = temp;
    }

}