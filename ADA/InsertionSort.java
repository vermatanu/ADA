import java.util.*;
class InsertionSort
{
    void insertionsort(int arr[])
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no of elements in array :");
		int n=sc.nextInt();
		int[] arr =new int[n];
		System.out.print("enter the elements of the array : ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		InsertionSort s=new InsertionSort();
		s.insertionsort(arr);
		System.out.println("the sorted array is : ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}