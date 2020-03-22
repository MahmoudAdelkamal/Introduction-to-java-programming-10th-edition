package Chapter9.Excercise_7;
import java.util.Date;
public class Account
{
    private int ID;
    private double balance;
    private double AnnualInterestRate;
    private Date DateCreated;
    public Account()
    {
    	DateCreated=new Date();
    }
    public Account(int ID,double balance)
    {
    	this();
    	this.ID=ID;
    	this.balance=balance;
    }
    public Account(int ID,double balance,double AnnualInterestRate)
    {
    	this(ID,balance);
    	this.AnnualInterestRate=AnnualInterestRate;
    }
    public void SetID(int ID)
    {
    	this.ID=ID;
    }
    public int GetID()
    {
    	return ID;
    }
    public void SetBalance(double balance)
    {
    	this.balance=balance;
    }
    public double GetBalance()
    {
    	return balance;
    }
    public void SetAnnualInterestRate(double AnnualInterestRate)
    {
    	this.AnnualInterestRate=AnnualInterestRate;
    }
    public double GetAnnualInterestRate()
    {
    	return AnnualInterestRate;
    }
    public Date GetDate()
    {
    	return DateCreated;
    }
    public double getMonthlyInterestRate()
    {
    	return balance*(AnnualInterestRate/12)/100;
    }
    public void Withdraw(double amount)
    {
    	balance-=amount;
    	balance=Math.max(balance,0);
    }
    public void Deposit(double amount)
    {
    	balance+=amount;
    }
}
