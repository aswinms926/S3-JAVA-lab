import java.util.Scanner;
public class matrix_multipication {
    public static void main(String args[])
    {
        int r1,c1,r2,c2,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and column of the first matrix : ");
        r1=sc.nextInt();
        c1=sc.nextInt();
        System.out.println("Enter the rows and column of the second matrix : ");
        r2=sc.nextInt();
        c2=sc.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int [r2][c2];
        int d[][]=new int [r1][c2];
        if(c1==r2) {
            System.out.println("Enter the elements of the matrix 1 : ");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter the elements of the matrix 2 : ");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {
                    d[i][j]=0;
                    for(int k=0;k<c1;k++)
                    {
                        d[i][j]=d[i][j]+a[i][k]*b[k][j];
                    }

                }
            }
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c2; j++) {

                    System.out.println(d[i][j]+"  ");
                }System.out.println();
            }
        }
        else {
            System.out.println("multiplication is not possible ");
        }

    }
}
