
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) 
	{
		String str =new String();
		String rev =new String();
		Scanner s=new Scanner(System.in);
		int n=0,flag=0;
		while(n!=2)
		{
			System.out.println(" Enter the String");
			str=s.nextLine();
			int length=str.length();
			char[] a=str.toLowerCase().toCharArray();
			for(int i=0;i<=length/2;i++)
			{
				if(a[i]!=a[length-i-1])
				{
					flag=1;
				}
			}
			if(flag==1)
				System.out.println("String is not palindrome");
			else
				System.out.println("String is  palindrome");
			n++;
		}}
}
