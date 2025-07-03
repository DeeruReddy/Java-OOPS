// Abstract class
abstract class BankAccount{
    private String AccountHolderName;
    private double Balance;
    private String City;
    
    // creating a constructor 
    
    public BankAccount(String AccountHolderName,double Balance, String City){
        this.AccountHolderName=AccountHolderName;
        this.Balance = Balance;
        this.City = City;
    }
    
    // encapsulation - getter, setter methods 
    
    public String getAccountHolderName(){
        return AccountHolderName;
    }
    
    public void setAccounHolderName(String AccountHolderName){
        this.AccountHolderName=AccountHolderName;
    }
    
    public double getBalance(){
        return Balance;
    }
    
    public void setBalance(double Balance){
        this.Balance = Balance;
    }
    
    public String getCity(){
        return City;
    }
    
    public void setCity(String City){
        this.City = City;
    }
    
    public void deposit(double amount){
        if(amount>0){
            System.out.println("Deposited amount:" + amount);
            Balance +=amount;
        }
        else{
            System.out.println("Deposit positive amount");
        }
    }
    
    public void withdraw(double amount){
        if(amount>0 && amount<=Balance){
            System.out.println("withdraw amount:" + amount);
            Balance -= amount;
        }
        else{
            System.out.println("Invalid amount");
        }
    }
}

// Child class
class savingsAccount extends BankAccount{
    public savingsAccount( String AccountHolderName, double Balance, String City){
    super(AccountHolderName ,Balance, City);
    }
    
    public void displayDetails(){
        System.out.println("Savings Account");
        System.out.println("Account Holder Name :" + getAccountHolderName());
        System.out.println("Account Balance:" + getBalance());
        System.out.println("City: " + getCity());
    }
}

class currentAccount extends BankAccount{
    public currentAccount(String AccountHolderName, double Balance, String City){
    super(AccountHolderName ,Balance, City);}
    
    
    public void displayDetails(){
        System.out.println("Current Account");
        System.out.println("Account Holder Name :" + getAccountHolderName());
        System.out.println("Account Balance:" + getBalance());
        System.out.println("City: " + getCity());
    }
}

// Main class
public class Main{
    public static void main(String[] args){
    savingsAccount savings = new savingsAccount("Deeraj", 1000.00,"Blr");
    currentAccount current = new currentAccount("Sathvika", 6000.00,"Atp");
    savings.displayDetails();
    savings.deposit(5000.00);
    savings.withdraw(200.00);
    
    savings.displayDetails();
    
    current.displayDetails();    
    }
}


