package aswin;
import java.util.Scanner;
public class matrix_addition
{
    public static void main (String[] args) {
        int i,j;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the row and column size : ");
        int r = obj.nextInt();
        int c = obj.nextInt();
        int a1[][] = new int[r][c];
        int a2[][] = new int[r][c];
        int sum[][] = new int[r][c];
        System.out.println("Enter the elements of array 1: ");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                a1[i][j]=obj.nextInt();
            }
        }
        System.out.println("Enter the elements of array 2 : ");
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                a2[i][j]=obj.nextInt();
            }
        }
        for (i = 0; i < r; i++)
        {
            for (j = 0; j < c; j++)
            {
                sum[i][j]=a1[i][j]+a2[i][j];
            }
            }
        System.out.println("sum is : ");
       for (i = 0; i < r; i++)
            {
                System.out.println();
                for (j = 0; j < c; j++)
                {
                    System.out.print(sum[i][j] + " ");

                }
            }
    }
}
