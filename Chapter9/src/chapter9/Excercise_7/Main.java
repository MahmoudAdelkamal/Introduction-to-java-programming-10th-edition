package Chapter9.Excercise_7;

public class Main 
{
	public static void main(String args[])
	{
		Account account=new Account(1122,20000,4.5);
	    account.Withdraw(2500);
	    account.Deposit(3000);
	    System.out.println("Your account number is " + account.GetID());
	    System.out.println("Your current balance is " +account.GetBalance());
	    System.out.println("Your account monthly Interset Rate is "+account.getMonthlyInterestRate());
	    System.out.println("The date your account was created is " + account.GetDate());
	}
}
