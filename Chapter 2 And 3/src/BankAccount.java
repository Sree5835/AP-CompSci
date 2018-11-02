// File: BankAccount.java

// The BankAccount class provides examples of everything we need to know to
// get started creating our own classes, including:
// 
//   1. 2 instance variables
//   2. 3 constructors 
//   3. 2 accessor and 3 mutator methods
//
//*****************************************************************************

/**
 * A class to represent a bank account with an account number and a balance
 * that can be changed by deposits and withdrawals.
 */
public class BankAccount
{
    /* Instance Fields */
	//account number (STRING of 6 numbers)
	private String accNum;
    //account balance
	private double accBalance;

    /**
     * Constructors construct a bank account by initializing an the instance field variables
     * @param acctNum the account number
     * @param initialBalance the initial balance
     */
    public BankAccount(String acctNum, double initialBalance)
    {
    	accNum = acctNum;
    	accBalance = initialBalance;
    }
    
    public BankAccount(String acctNum)
    {
    	accNum = acctNum;
    }
    
    public BankAccount ()   //Default constructor sets object's balance to 0
    {						//and account number to 000000
    	accNum="000000";
    	accBalance=0;
    }

 //****************************************************************************
    /**
     *  @return the account number
     */
    public String getAccount()    //"accessor/gettor" method
    {
       	return accNum;
    }

    /**
     *  @return the balance
     */
    public double getBalance()     //"accessor/gettor" method
    {
    	return accBalance; 	
    }
    
    /**
     *  Sets the Account Number to acctNum
     *  @param acctNum is the new account Number
     */
    public void setAccountNumber(String acctNum) //"mutator/setter" method
    {											 
    	accNum = acctNum;  	
    }
    
    /**
     *  Deposits money into the bank account.
     *  @param amount is the amount to be deposited
     */
    public void deposit(double amount)      //"mutator/setter" method
    {
    	accBalance += amount;										
    }

    /**
     *  Withdraws money from the bank account.
     *  @param amount is the amount to be withdrawn
     */
    public void withdraw(double amount)     //"mutator/setter" method
    {
      	accBalance -= amount;
    }


 
 }
//******************** end of BankAccount class  ********************************