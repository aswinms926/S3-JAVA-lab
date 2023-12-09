import java.util.Scanner;
class A
{
	  void  area(int x)
	{
		System.out.println("The area of the square is " +x*x +"  sq unit");
	}
	  void area(int c, int b)
	{
		System.out.println("The area of the rectangle is " +c*b +"  sq unit");
	}
	  void area(double y)
	{
		double z= y*y*3.14;
		System.out.println("The area of the circle is " +z +"  sq unit");
	}
}
public class Over_loading  
{

	public static void main(String[] args)
	{
		Scanner ob= new Scanner(System.in);
		System.out.println("Enter the length of one side of the square ");
		int x=ob.nextInt();
		System.out.println("Enter the length and breadth of the rectangle ");
		int c=ob.nextInt();
		int b=ob.nextInt();
		System.out.println("Enter the radius of the circle ");
		double y=ob.nextDouble();
		A obj=new A();
		obj.area(x);
		obj.area(c,b);
		obj.area(y);
		
		
	}

}