package win;
import java.io.*;
import  java.util.Scanner;
public class File {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);

		System.out.println("Enter the data :");
		String data=sc.nextLine();
		int n=data.length();
		FileWriter out;
		try
		{
			out=new FileWriter("sample.txt");
			out.write(data);
			out.flush();
			System.out.println("success:");

		}catch(IOException e)
		{
			System.out.println("error"+e);

		}
		FileReader input;
		char[] c=new char[n];
		try
		{
			input=new FileReader("sample.txt");
			input.read(c);
			
			out=new FileWriter("new.txt");
			out.write(c);
			out.flush();
			System.out.println("successfully copied :");

		}catch(IOException e)
		{
			System.out.println("error"+e);

		}

	}

}
