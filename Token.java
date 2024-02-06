package win;
import java.util.StringTokenizer;
import java.util.Scanner;
public class Token {
	public static void main(String args[])
	{
		int n,sum=0;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the integer with spaces :");
	String d=sc.nextLine();
	StringTokenizer st=new StringTokenizer(d," ");
	String a;
	System.out.println("individual integers :");

	while(st.hasMoreTokens())
	{
		a=st.nextToken();
		n=Integer.parseInt(a);
		System.out.println(n+"\n");
		sum=sum+n;
	}
	System.out.println("sum : "+sum);

	}
}
