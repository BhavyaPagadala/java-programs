class Account{
   protected String accountHolder;
   protected double balance;
   public Account(String accountHolder,double initialBalance){
   	this.accountHolder=accountHolder;
   	this.balance=initialBalance;
   }
   void deposit(double amount){
   	balance+=amount;
   	System.out.print(amount+ "deposited.Newbalance:"+balance);
   }
   void displayBalance(){
	System.out.println("Balance :"+balance);
   }
}
class SavingsAccount extends Account{
   private double interestRate;
   public SavingsAccount(String accountHolder,double initialBalance,double interestRate){
   	super(accountHolder,initialBalance);
   	this.interestRate=interestRate;
   }
   void addInterest(){
   	double interest=balance*interestRate/100;
   	balance+=interest;
   	System.out.println("interest added.New balance:"+balance);
   }
}
class CurrentAccount extends Account{
       private double overdraftlimit;
       public CurrentAccount(String accountHolder,double initialBalance,double overdraftlimit){
       	super(accountHolder,initialBalance);
       	this.overdraftlimit=overdraftlimit;
       }
       void withdraw(double amount){
       	if(balance-amount<-overdraftlimit){
       		System.out.println("Overdraft limit extended,cannot withdraw");
       	}else{
       		balance-=amount;
       		System.out.println(amount+ "withdrawn ,New balance="+balance);
       	}
       }
}
public class Hierarchical{
	public static void main(String args[]){
		SavingsAccount savings=new SavingsAccount("Sreeja",50000,5);
		savings.deposit(1000);
		savings.addInterest();
		savings.displayBalance();
		CurrentAccount current =new CurrentAccount("pranav:",3000,2000);
		current.deposit(500);
		current.withdraw(1400);
		current.withdraw(3000);
	}
}
    
   		
