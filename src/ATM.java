//Task-3 ATM Interface
import java.util.Scanner;
public class ATM {
	public static void main (String[]args) {
		bankAccount account = new bankAccount(1000);
		ATM atm = new ATM(account);
		atm.run();
	}
	private bankAccount  userAccount  ;

			public ATM (bankAccount account) {
				userAccount = account;
		    }
			public void displayMenu() {
			System.out.println("Automate Teller Machine");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit");
			System.out.println("3.Withdraw");
			System.out.println("4.Exit");
			}

		 public void run() {
			 Scanner sc=new Scanner(System.in);
			 int choice;
			 do {
				 displayMenu();
				 System.out.println("Enter your Choice");
				 choice=sc.nextInt();
				 
				 
				 switch (choice) {
				 case 1:
					 checkBalance();
					 break;
				 case 2:
					 deposit(sc);
					 break;
				 case 3:
					 withdraw(sc);
					 break;
					 
				 case 4:
					 System.out.println("Thank you for using ATM");
					 break;
				default:
					System.out.println("Invalid Choice! Try again");

				 }
		     }while (choice!=4);
			  sc.close();
		  }
		 
		 private void checkBalance() {
		 System.out.println("Your Balance is:"+userAccount.getBalance());
		}
		 
		 private void deposit(Scanner sc) {
			 System.out.println("Enter the Amount to deposit:Rs");
			 double amount =sc.nextDouble();
			 userAccount.deposit(amount);
			 }
		    
		private void withdraw(Scanner sc) {
			System.out.println("Enter the amount to withdraw :Rs");
			double amount =sc.nextDouble();
			if(userAccount.withdraw(amount)) {
				System.out.println("Please take your cash");
		   }else {
			   System.out.println("Transaction Failed");
		   }
			


		 
		}

	
}
