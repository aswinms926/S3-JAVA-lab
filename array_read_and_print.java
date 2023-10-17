package aswin;
import java.util.Scanner;
public class array_read_and_print
{
    public static void main (String[] args) {
    int i;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int n= obj.nextInt();
        System.out.println(" array size is : "+n);
        int arr[]=new int[n];
        System.out.println("Enter the array elements: ");
        for (i = 0; i < n; i++)
        {
           arr[i]=obj.nextInt();
        }
        for (i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
