package win;
import  java.util.Scanner;

class Table
{
	synchronized  void  printTable()  
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"X"+i+"="+n*i);
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());

			}
		}
	}

	
		
	}
	

class MyThread1 extends Thread
{
	Table t;
	MyThread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable();
	}
}
class MyThread2 extends Thread
{
	Table t;
	MyThread2(Table t)
	{
		this.t=t;
	}
}
class MyThread3 extends Thread
{
	Table t;
	MyThread3(Table t)
	{
		this.t=t;
	}
}
public class Synchronization {
	public static void main(String args[]) 
	{
		Table obj=new Table();
		MyThread1 t1=new MyThread1(obj);
		MyThread2 t2=new MyThread2(obj);
		MyThread3 t3=new MyThread3(obj);
		t1.start();
		t2.start();
		t3.start();
	}

}
