
import java.util.Scanner;

public class bankAccount {
      private double balance;
	   public bankAccount (double initialBalance) {
		   balance=initialBalance;
		  }
	   public double getBalance(){
		   return balance;
		   
	   }
	   public void deposit(double amount) {
		   if(amount>0){
			   balance += amount;
			   System.out.println("Deposit of rs"+amount+"Successful");
		    }
		   else {
			   System.out.println("Invalid deposit amount ");
			 }
		  }
	   
	    public boolean withdraw(double amount){
	    	if(amount>0 && amount <= balance) {
	    		balance -= amount;
	    		System.out.println("Withdraw of rs"+amount+"Successful");
	    		return true;
	    	}else {
	    		System.out.println("Insufficent Balance ");
	    		return false;
	      }
	    }
	 }
    

	

