import java.util.Scanner;

public class quick {
    public static void swap(String[] b, int i, int j) {
        String temp = b[i];
        b[i] = b[j];
        b[j] = temp;
    }

    public static int partition(String [] a,int s, int e)
    {
        String pivot=a[s];
        int i=s;
        for(int j=s+1;j<=e;j++)
        {
            if(a[j].compareTo(pivot) <0)
            {
                i++;
                swap(a,i,j);
            }
        }
        swap(a,s,i);
        return i;
    }

    public static void quicksort(String []a,int s,int e)
    {
        if(s<e)
        {
            int pivot=partition(a,s,e);
            quicksort(a,s,pivot-1);
            quicksort(a,pivot+1,e);
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n = Integer.parseInt(sc.nextLine());

        String[] a = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLine();
        }

        quicksort(a, 0, n - 1);

        System.out.print("Sorted strings: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
