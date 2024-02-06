package win;

import java.util.Scanner;
class InvalidamountException extends Exception
{
	InvalidamountException(String str)
	{
		super(str);
	}
}
class InsufficientfundException extends Exception
{
	InsufficientfundException(String str)
	{
		super(str);
	}
}
class Customer
{
	int Accountno;
	int balance;
	String name;
	String Accounttype;
	public void setDetails()
	{
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter the customer name :");
		name=sc.nextLine();
		System.out.println("Enter the customer Accountno :");
		 Accountno=sc.nextInt();
		System.out.println("Enter the Accounttype :");
		Accounttype=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the balance :");
		balance=sc.nextInt();
	}
	public void getdetails()
	{
		System.out.println("Customer name : "+name);
		System.out.println("Customer acc no : "+Accountno);

		System.out.println("Customer Accounttype: "+Accounttype);
		System.out.println("Customer balance  : "+balance);
 
	}
	public void deposit(Customer[] customer) throws Exception
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the acc no to depost : ");
		int acno=sc.nextInt();
		try
		{
			
		
		System.out.println("Enter the amounnt to deposit : ");
		int dep=sc.nextInt();
		if(dep<0)
		{
		 throw new InvalidamountException("invalid");
		}
		else
		{
			for(int i=0;i<customer.length;i++)
			{
				if(customer[i].Accountno==acno)
				{
					customer[i].balance=customer[i].balance+dep;
					System.out.println("deposisted succesully for the customer " + customer[i].name);
					customer[i].getdetails();
				}
			}
		}
		}catch(InvalidamountException e)
		{
			 System.out.println(e.getMessage());
		}
		
	}
	public static void withdraw(Customer []customer) throws Exception
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the acc no to depost : ");
		int acno=sc.nextInt();
		try
		{
		System.out.println("Enter the amounnt to withdraw: ");
		int w=sc.nextInt();
		if(w<=0)
		{
			throw new InsufficientfundException("insufficient");
		}
		else
		{
			for(int i=0;i<customer.length;i++)
			{
				if(customer[i].Accountno==acno)
{
	if(w>customer[i].balance)
	{
		throw new InsufficientfundException("insufficient");
	}
	else
	{
		customer[i].balance=customer[i].balance-w;
		System.out.println("Withdrawal successful for customer " + customer[i].name);
		customer[i].getdetails();
	}

}
			}
		}}catch(InsufficientfundException e)
		{
			 System.out.println(e.getMessage());
		}

}
public class Bank {
	public static Customer[] customer;
	
	public static void main(String args[]) throws Exception
	{
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of customers : ");
		int customerno=sc.nextInt();
		customer=new Customer[customerno];
		for(int i=0;i<customerno;i++)
		{
			customer[i]=new Customer();
			customer[i].setDetails();
			
		}
		do
		{
			System.out.println("1) Display Account Details");
            System.out.println("2) Search by account number");
            System.out.println("3) Deposit the amount");
            System.out.println("4) Withdraw the amount");
            System.out.println("5)Exit");
            System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
            case 1 :
            	Display();
            	break;
            case 2 :
            	Search();
            	break;
            case 3 :
            	Deposit();
            	break;
            case 4 :
            	Withdraw();
            	break;
            case 5 :
            
            	break;
            	default : 
            		break;
            	
            }
		}while(ch!=5);
		
	}
 public static	void Display()
	{
		for(int i=0;i<customer.length;i++)
		{
			customer[i].getdetails();
		}
	}
 public static	void Search()
	{
	 Scanner sc=new Scanner (System.in);
	 System.out.println("Enter the acc no to search : ");
	 int acno=sc.nextInt();
		for(int i=0;i<customer.length;i++)
		{
			if(customer[i].Accountno==acno)
			{
				customer[i].getdetails();
			}
		}
	}
 public static	void Deposit() throws Exception 
	{
	 
		for(int i=0;i<customer.length;i++)
		{
			
				customer[i].deposit(customer);
			
		}
	}

public static	void  Withdraw() throws Exception 
	{
	 
		for(int i=0;i<customer.length;i++)
		{
			
				customer[i].withdraw(customer);
			
		}
	}
}
}
