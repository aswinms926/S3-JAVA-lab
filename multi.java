package win;
import java.util.Random;
class EvenThread extends Thread

{
	int num;
	EvenThread( int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("square of "+num+" is "+num*num);

	}
}
class  OddThread extends Thread

{
	int num;
	 OddThread( int num)
	{
		this.num=num;
	}
	public void run()
	{
		System.out.println("cube"+ " of "+num+" is "+num*num*num);

	}
}

class RandomThread extends Thread
{
	public void run()
	{
		Random e=new Random();
		for(int i=0;i<10;i++)
		{
			int num=e.nextInt(20);
			if(num%2==0)
			{
				new EvenThread(num).start();
			}
			else
			{
				new OddThread(num).start();
			}
		}
	}
}
public class multi {
	public static void main(String args[]) {
	RandomThread r=new RandomThread();
	r.start();
	}
}
