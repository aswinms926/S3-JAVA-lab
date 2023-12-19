import java.util.Scanner;
class Quick
{
	void swap(int arr[],int a, int b)
	{
		int t=arr[a];
				arr[a]=arr[b];
		arr[b]=t;
	}
	int partition(int arr[],int l,int b)
	{
		int pivot=arr[l];
		int i=l+1;
		int j=b;
		while(i<=b)
		{
			if(arr[i]<pivot)
			{
				i++;
			}
			if(arr[j]>pivot)
			{
				j--;
			}
			if(i<=j)
			{
				swap(arr,i,j);
				i++;
				j--;
			}
			swap(arr,l,j);
			
		}swap(arr,l,j);
		return j;
	}
	void quick(int arr[],int s,int e)
	{
		int loc= partition(arr,s,e);
		swap(arr,s,loc-1);
		swap(arr,loc-1,e);
	}
	
}
 
public class Quick_Sort {
	public static void main(String[] args) 
	{
		int l,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the array elements : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Unsorted Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		Quick now=new Quick();
		now.quick(arr,0,n-1);
		System.out.println("sorted Array");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
