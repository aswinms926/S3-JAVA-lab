package win;
import  java.util.Scanner;
import java.io.*;
public class copy_content_of_file {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		try
		{
			 
		System.out.println("Enter the name of the filw=e whose contenr is to be copied : ");
		String f1=sc.nextLine();
		System.out.println("Enter the name of the file to recieve the content : ");
		String f2=sc.nextLine();
		 FileReader r=new FileReader(f1);
		 FileWriter w=new FileWriter(f2);
		 int ch;
		 while((ch=r.read())!=-1) {
			 w.write(ch);
				

		 }
		 System.out.println("Content of the file "+f1+"is copied to "+f2);r.close();
		 w.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file not found"+e);

		}
		catch(IOException e)
		{
			System.out.println("error "+e);

		}
		
	}

}
